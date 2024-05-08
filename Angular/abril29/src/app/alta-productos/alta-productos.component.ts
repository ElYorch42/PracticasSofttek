import { Component } from '@angular/core';
import { ActivatedRoute, Route, Router, RouterLink } from '@angular/router';
import { ProductosService } from '../_servicio/productos.service';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Producto } from '../_modelo/Producto';

@Component({
  selector: 'app-alta-productos',
  standalone: true,
  imports: [RouterLink,ReactiveFormsModule],
  templateUrl: './alta-productos.component.html',
  styleUrl: './alta-productos.component.css',
})
export class AltaProductosComponent {
  form: FormGroup;
  id: number = 0;
  edicion: boolean = false;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private servicio: ProductosService
  ) {
    this.form = new FormGroup({
      'idProducto': new FormControl(0),
      'nombreProducto': new FormControl(''),
      'precioUnitario': new FormControl(0),
      'unidadesStock': new FormControl(0),
      'idCategoria': new FormControl(0),
    });
  }

  ngOnInit(): void {
    this.route.params.subscribe((data) => {
      this.id = data['id'];
      this.edicion = data['id'] != null;
      this.formaFormulario();
    });
  }

  formaFormulario() {
    if (this.edicion) {
      this.servicio.listarPorId(this.id).subscribe((data) => {
        this.form = new FormGroup({
          'idProducto': new FormControl(data.idProducto),
          'nombreProducto': new FormControl(data.nombreProducto),
          'precioUnitario': new FormControl(data.precioUnitario),
          'unidadesStock': new FormControl(data.unidadesStock),
          'idCategoria': new FormControl(data.idCategoria)
        });
      });
    }
  }


  operar() {
    let p:Producto = {
        'idProducto': this.form.value['idProducto'],
        'nombreProducto': this.form.value['nombreProducto'],
        'precioUnitario': this.form.value['precioUnitario'],
        'unidadesStock': this.form.value['unidadesStock'],
        'idCategoria': this.form.value['idCategoria']
    }
    if (this.edicion) {
      this.servicio.modificar(p).subscribe(() =>{
        this.servicio.listar().subscribe(data=>{
          this.servicio.productoCambio.next(data)})});
    } else {
      this.servicio.alta(p).subscribe(() =>{
        this.servicio.listar().subscribe(data=>{
          this.servicio.productoCambio.next(data)})});
          //el .next() es para avisar de que ha habido un cambio y pasarle los cambios y asi 
          //los .subscribe() registran que ha habido un cambio 
    }
    this.router.navigate([''])
  }

}
