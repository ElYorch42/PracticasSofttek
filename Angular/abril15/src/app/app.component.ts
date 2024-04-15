import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ejercicio1Component } from './ejercicio1/ejercicio1.component';
import { EjercicioDirectivasComponent } from './ejercicio-directivas/ejercicio-directivas.component';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,Ejercicio1Component,EjercicioDirectivasComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'abril15';
}
