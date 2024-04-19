import { Component, EventEmitter, Output } from '@angular/core';
import { Ejercicio3PadreComponent } from '../ejercicio3-padre/ejercicio3-padre.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio3-hijo',
  standalone: true,
  imports: [Ejercicio3PadreComponent,FormsModule],
  templateUrl: './ejercicio3-hijo.component.html',
  styleUrl: './ejercicio3-hijo.component.css'
})
export class Ejercicio3HijoComponent {

  listaAsignaturas = ["Programacion en Java","Json","JS","php"];

  asignaturaSeleccionada:string = "JS";

  @Output() enviarLista = new EventEmitter<string>();

  enviarAsignaturas() {
    this.enviarLista.emit(this.asignaturaSeleccionada);
    console.log("producto enviado:"+this.asignaturaSeleccionada)
  }
}
