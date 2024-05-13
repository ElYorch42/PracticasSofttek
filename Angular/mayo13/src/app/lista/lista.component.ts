import { Component } from '@angular/core';
import { ProfesorServicioService } from '../_servicio/profesor-servicio.service';
import { Profesor } from '../_modelo/profesor';
import { RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-lista',
  standalone: true,
  imports: [RouterLink,RouterOutlet],
  templateUrl: './lista.component.html',
  styleUrl: './lista.component.css'
})
export class ListaComponent {
  listaProfesores:Profesor[]=[];

  constructor(private servicio:ProfesorServicioService) {}

  ngOnInit(): void {
    this.servicio.profesorCambio.subscribe((data)=> {this.listaProfesores = data});

    this.servicio.listar().subscribe(datos => {this.listaProfesores = datos; console.log("lista")})
  }


  eliminar(id:number) {
    this.servicio.eliminar(id).subscribe(() =>{this.servicio.listar().subscribe(data=>this.servicio.profesorCambio.next(data))});
  }
}
