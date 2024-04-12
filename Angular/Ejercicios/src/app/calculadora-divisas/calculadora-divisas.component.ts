import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculadora-divisas',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './calculadora-divisas.component.html',
  styleUrl: './calculadora-divisas.component.css'
})
export class CalculadoraDivisasComponent {
  dinero:number =0;
  tipoMonedaInicial:string = 'euro'
  tipoMonedaConversion:string = 'euro'

  mensaje:string= '';

  seleccionInicial = (seleccion: string) => this.tipoMonedaInicial = seleccion;

  seleccionConversion = (seleccion:string) => this.tipoMonedaConversion =seleccion;
  //1 euro son 0.85 libras
  //1 euro son 1.07 dolares
  //1 libra son 1.17 euros
  //1 libra son 1.25 dolares
  //1 dolar son 0.94 euros
  //1 dolar son 0.80 libras
  
  calcular() {
    if (this.tipoMonedaInicial != this.tipoMonedaConversion) {
      switch(this.tipoMonedaInicial) {
        case 'euro':
            if (this.tipoMonedaConversion == 'libra') {
              this.mensaje = (this.dinero*0.85).toString();
            } else {
              this.mensaje = (this.dinero*1.07).toString();
            }
          break;
          case 'libra':
            if (this.tipoMonedaConversion == 'euro') {
              this.mensaje = (this.dinero*1.17).toString();
            } else {
              this.mensaje = (this.dinero*1.25).toString();
            }
          break;
          case 'dolar':
            if (this.tipoMonedaConversion == 'libra') {
              this.mensaje = (this.dinero*0.94).toString();
            } else {
              this.mensaje = (this.dinero*0.80).toString();
            }
          break;
          default:
            this.mensaje = 'error'
            break;
      }
    } else {
      this.mensaje = this.dinero.toString();
    }
  }
}
