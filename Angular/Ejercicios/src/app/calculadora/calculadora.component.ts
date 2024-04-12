import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculadora',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './calculadora.component.html',
  styleUrl: './calculadora.component.css',
})
export class CalculadoraComponent {
  numero1: number = 0;
  numero2: number = 0;

  mensaje = '';

  calcular(seleccion: string) {
    switch (seleccion) {
      case '+':
        this.mensaje = (this.numero1+this.numero2).toString();
        break;
      case '-':
        this.mensaje = (this.numero1-this.numero2).toString();
        break;
      case '*':
        this.mensaje = (this.numero1*this.numero2).toString();
        break;
      case '/':
        if (this.numero2 != 0) {
          this.mensaje = (this.numero1/this.numero2).toString();
        } else {
          this.mensaje = 'No se puede dividir entre 0'
        }
        break;
      default:
        this.mensaje = 'Error'
        break;
    }
  }
}
