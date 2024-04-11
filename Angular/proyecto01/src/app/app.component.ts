import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ts01Component } from './ts01/ts01.component';
import { Angular01Component } from './angular01/angular01.component';
import { Ej1Component } from './ej1/ej1.component';
import { Ej2Component } from './ej2/ej2.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,Ts01Component,Angular01Component,Ej1Component,Ej2Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'proyecto01';
}
