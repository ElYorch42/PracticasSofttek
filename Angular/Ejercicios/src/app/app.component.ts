import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ejercicio1Component } from './ejercicio1/ejercicio1.component';
import { CalculadoraComponent } from './calculadora/calculadora.component';
import { CalculadoraDivisasComponent } from './calculadora-divisas/calculadora-divisas.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,Ejercicio1Component,CalculadoraComponent,CalculadoraDivisasComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Ejercicios';
}
