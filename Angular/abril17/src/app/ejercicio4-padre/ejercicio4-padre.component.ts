import { Component } from '@angular/core';
import { Persona } from '../_modulos/persona';
import { Ejercicio4HijoComponent } from '../ejercicio4-hijo/ejercicio4-hijo.component';

@Component({
  selector: 'app-ejercicio4-padre',
  standalone: true,
  imports: [Ejercicio4HijoComponent],
  templateUrl: './ejercicio4-padre.component.html',
  styleUrl: './ejercicio4-padre.component.css'
})
export class Ejercicio4PadreComponent {

  listaPersonas:Persona[] = [];

  recibirPersonas(persona:Persona){
    console.log("Producto recibido:"+persona.nombre);
    if (!this.listaPersonas.includes(persona)) {
      this.listaPersonas.push(persona);
    }
  }

  borrarUltimo() {
    this.listaPersonas.pop();
  }

  filtrarEdades() {
    let listaFiltrada = this.listaPersonas.filter(persona=> persona.edad>20);
    this.listaPersonas = listaFiltrada;
  }
  calcularDobles() {
    let listaFiltrada : Persona[] = this.listaPersonas.map(persona => {
      return {
        nombre: persona.nombre,
        edad: persona.edad*2
      }});
    this.listaPersonas = listaFiltrada;
  }
}
