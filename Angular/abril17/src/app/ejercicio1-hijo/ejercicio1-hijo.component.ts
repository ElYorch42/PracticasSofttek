import { Component, EventEmitter, Input, Output, SimpleChanges} from '@angular/core';
import { Ejercicio1PadreComponent } from '../ejercicio1-padre/ejercicio1-padre.component';

@Component({
  selector: 'app-ejercicio1-hijo',
  standalone: true,
  imports: [Ejercicio1PadreComponent],
  templateUrl: './ejercicio1-hijo.component.html',
  styleUrl: './ejercicio1-hijo.component.css'
})
export class Ejercicio1HijoComponent {
  @Input()
  mensaje: any;

  listaProductos = ["Leche","pan","cafe","azucar","huevos","platanos"];

  @Output() enviarLista = new EventEmitter<string>();

  enviarProductocesta(producto:string) {
    this.enviarLista.emit(producto);
    console.log("producto enviado:"+producto)
  }
  
}
