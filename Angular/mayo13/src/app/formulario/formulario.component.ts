import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Profesor } from '../_modelo/profesor';
import { ProfesorServicioService } from '../_servicio/profesor-servicio.service';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-formulario',
  standalone: true,
  imports: [ReactiveFormsModule,RouterLink],
  templateUrl: './formulario.component.html',
  styleUrl: './formulario.component.css'
})
export class FormularioComponent {

  form: FormGroup;
  id: number = 0;
  edicion: boolean = false;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private servicio: ProfesorServicioService
  ) {
    this.form = new FormGroup({
      'id': new FormControl(0),
      'nombre': new FormControl(''),
      'correo': new FormControl(''),
      'especialidad': new FormControl('')
    });
  }

  ngOnInit(): void {
    this.route.params.subscribe((data) => {
      this.id = data['id'];
      this.edicion = data['id'] != null;

      if (this.edicion) {
        this.servicio.listarPorId(this.id).subscribe((data) => {
          this.form = new FormGroup({
            'id': new FormControl(data.id),
            'nombre': new FormControl(data.nombre),
            'correo': new FormControl(data.correo),
            'especialidad': new FormControl(data.especialidad)
          });
        });
      }

    });
  }

  
  aceptar() {
    let p:Profesor = {
        'id': this.form.value['id'],
        'nombre': this.form.value['nombre'],
        'correo': this.form.value['correo'],
        'especialidad': this.form.value['especialidad']
    }
    if (this.edicion) {
      this.servicio.modificar(p).subscribe(() =>{
        this.servicio.listar().subscribe(data=>{
          this.servicio.profesorCambio.next(data)})});
    } else {
      this.servicio.alta(p).subscribe(() =>{
        this.servicio.listar().subscribe(data=>{
          this.servicio.profesorCambio.next(data)})});
    }
    this.router.navigate([''])
  }
}

