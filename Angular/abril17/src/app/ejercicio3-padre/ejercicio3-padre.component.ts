import { Component } from '@angular/core';
import { Ejercicio3HijoComponent } from '../ejercicio3-hijo/ejercicio3-hijo.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio3-padre',
  standalone: true,
  imports: [Ejercicio3HijoComponent,FormsModule],
  templateUrl: './ejercicio3-padre.component.html',
  styleUrl: './ejercicio3-padre.component.css'
})
export class Ejercicio3PadreComponent {

  listaAsignaturas:string[] = [];

  recibirAsignaturas(asignatura:string){
    console.log("Producto recibido:"+asignatura);
    if (!this.listaAsignaturas.includes(asignatura)) {
      this.listaAsignaturas.push(asignatura);
    }
  }  
}
