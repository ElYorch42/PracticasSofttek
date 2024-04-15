import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio-directivas',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './ejercicio-directivas.component.html',
  styleUrl: './ejercicio-directivas.component.css',
})
export class EjercicioDirectivasComponent {
  tamRAM = ['RAM32', 'RAM16', 'RAM8'];
  tamRAMseleccionada: string = '';
  tipoProcesaddor = [
    'Intel 9900k',
    'Intel 13700K',
    'Ryzan 5800x',
    'Ryzen 7500x',
  ];
  tipoProcesaddorseleccionada: string = '';
  DiscoDuro = ['HDD', 'SSD'];
  DiscoDuroseleccionada: string = '';
  FuentesDeAlimentacion = ['600', '750', '800', '1000'];
  FuentesDeAlimentacionseleccionada: string = '';

  vuelosOrigen = [
    'España',
    'Francia',
    'Portugal',
    'Italia',
    'Reino Unido',
    'Alemania',
  ];
  vuelosOrigenseleccionada: string = '';
  vuelosDestinos = [
    'España',
    'Francia',
    'Portugal',
    'Italia',
    'Reino Unido',
    'Alemania',
  ];
  vuelosDestinosseleccionada: string = '';
  fechaIdaSeleccionada: string = '';
  fechaVueltaSeleccionada: string = '';
  numeroPasajerosSeleccionada: number = 0;

  genero = ['Hombre', 'Mujer', 'Otro'];
  generoSeleccionado: string = '';
  nacionalidades = [
    'España',
    'Francia',
    'Portugal',
    'Italia',
    'Reino Unido',
    'Alemania',
  ];
  nacionalidadesSeleccionada: string = '';
  lenguajes = ['C++', 'Java', 'Python', 'JS'];
  lenguajesSeleccionados = [
    {nombre:'C++', seleccion:false},
    {nombre:'Java', seleccion:false},
    {nombre:'Python', seleccion:false},
    {nombre:'JS', seleccion:false}
  ];
    

  mostrarOrdenador() {
    console.log(this.tamRAMseleccionada);
    console.log(this.tipoProcesaddorseleccionada);
    console.log(this.DiscoDuroseleccionada);
    console.log(this.FuentesDeAlimentacionseleccionada);
  }
  mostrarVuelos() {
    console.log(this.vuelosOrigenseleccionada);
    console.log(this.vuelosDestinosseleccionada);
    console.log(this.fechaIdaSeleccionada);
    console.log(this.fechaVueltaSeleccionada);
    console.log(this.numeroPasajerosSeleccionada);
  }
  mostrarDirectivas() {
    console.log(this.generoSeleccionado);
    console.log(this.nacionalidadesSeleccionada);
    console.log(this.lenguajesSeleccionados);
  }
}
