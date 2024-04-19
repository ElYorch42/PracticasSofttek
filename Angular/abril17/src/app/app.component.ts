import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ejercicio1PadreComponent } from './ejercicio1-padre/ejercicio1-padre.component';
import { Ejercicio1HijoComponent } from './ejercicio1-hijo/ejercicio1-hijo.component';
import { Ejercicio3PadreComponent } from './ejercicio3-padre/ejercicio3-padre.component';
import { Ejercicio4PadreComponent } from './ejercicio4-padre/ejercicio4-padre.component';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,Ejercicio1PadreComponent,Ejercicio1HijoComponent,Ejercicio3PadreComponent,Ejercicio4PadreComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'abril17';
}
