import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { Ejercicio1BlogComponent } from './ejercicio1-blog/ejercicio1-blog.component';
import { Ejercicio2BlogComponent } from './ejercicio2-blog/ejercicio2-blog.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,RouterLink,Ejercicio1BlogComponent,Ejercicio2BlogComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'abril22';
}
