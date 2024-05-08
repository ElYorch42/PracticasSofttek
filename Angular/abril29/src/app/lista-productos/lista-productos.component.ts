import { Component } from '@angular/core';
import { Producto } from '../_modelo/Producto';
import { RouterLink, RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { ProductosService } from '../_servicio/productos.service';

@Component({
  selector: 'app-lista-productos',
  standalone: true,
  imports: [RouterOutlet,RouterLink,FormsModule],
  templateUrl: './lista-productos.component.html',
  styleUrl: './lista-productos.component.css'
})
export class ListaProductosComponent {
  listaProductos:Producto[]=[];

  constructor(private servicio:ProductosService) {}

  ngOnInit(): void {
    this.servicio.productoCambio.subscribe((data)=> {this.listaProductos = data});

    this.servicio.listar().subscribe(datos => {this.listaProductos = datos; console.log("lista")})
  }


  eliminar(id:number) {
    this.servicio.eliminar(id).subscribe(() =>{this.servicio.listar().subscribe(data=>this.servicio.productoCambio.next(data))});
  }
}
