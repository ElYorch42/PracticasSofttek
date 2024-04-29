import { Component } from '@angular/core';
import { ProductosService } from '../_servicio/productos.service';
import { Producto } from '../_modelo/Producto';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-formulario-producto',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './formulario-producto.component.html',
  styleUrl: './formulario-producto.component.css'
})
export class FormularioProductoComponent {
  producto:Producto = {
    idProducto:0,
    nombreProducto:'',
    precioUnitario:0,
    unidadesStock:0,
    idCategoria:0
  };

  constructor(private productoServicio:ProductosService){}

  darDeAlta(){
    this.productoServicio.darAlta(this.producto).subscribe();
  }
}
