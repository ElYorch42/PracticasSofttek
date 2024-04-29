import { Component } from '@angular/core';
import { Producto } from '../_modelo/Producto';
import { ProductosService } from '../_servicio/productos.service';

@Component({
  selector: 'app-lista-productos',
  standalone: true,
  imports: [],
  templateUrl: './lista-productos.component.html',
  styleUrl: './lista-productos.component.css'
})
export class ListaProductosComponent {

  listaProductos:Producto[]= [];
  constructor(private productoServicio:ProductosService) {}

  ngOnInit(){
    this.productoServicio.obtenerTodos().subscribe(data => this.listaProductos = data);
  }

}
