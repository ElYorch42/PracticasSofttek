import { Component, Output, EventEmitter, SimpleChanges } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Ejercicio1HijoComponent } from '../ejercicio1-hijo/ejercicio1-hijo.component';

@Component({
  selector: 'app-ejercicio1-padre',
  standalone: true,
  imports: [FormsModule,Ejercicio1HijoComponent],
  templateUrl: './ejercicio1-padre.component.html',
  styleUrl: './ejercicio1-padre.component.css'
})
export class Ejercicio1PadreComponent {
  ejercicio1MensajePadre:string = "mensaje daihodhaoufbaeus";
  
  listaProductos:string[] = [];

  recibirProductos(producto:string){
    console.log("Producto recibido:"+producto);
    if (!this.listaProductos.includes(producto)) {
      this.listaProductos.push(producto);
    }
  }  
  
}
