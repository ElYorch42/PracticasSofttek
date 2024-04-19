import { Component, EventEmitter, Output } from '@angular/core';
import { Persona } from '../_modulos/persona';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio4-hijo',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './ejercicio4-hijo.component.html',
  styleUrl: './ejercicio4-hijo.component.css'
})
export class Ejercicio4HijoComponent {
  nombre:string = '';
  edad:number = 0;

  @Output() enviarLista = new EventEmitter<Persona>();

  enviarPersonas() {
    let persona: Persona = {
      nombre:this.nombre, edad:this.edad
    };
    this.enviarLista.emit(persona);
    console.log("Persona enviada"+persona.nombre+" "+persona.edad)
  }
}
