import { Component } from '@angular/core';
import { Temporada } from '../_modelo/temporada';

@Component({
  selector: 'app-ejercicio1',
  standalone: true,
  imports: [],
  templateUrl: './ejercicio1.component.html',
  styleUrl: './ejercicio1.component.css',
})
export class Ejercicio1Component {
  temporada:Temporada=Temporada.Otoño;

  comprobarPersonaEj1() {
    let firstName: string;
    let lastName: string;
    let fullName: string;
    let age: number;
    let ukCitizen: boolean;
    firstName = 'Rebecca';
    lastName = 'Smith';
    age = 42;
    ukCitizen = false;
    fullName = firstName + ' ' + lastName;
    if (ukCitizen) {
      console.log(
        'My name is ' +
          fullName +
          ", I'm " +
          age +
          ", and I'm a citizen of the United Kingdom."
      );
    } else {
      console.log(
        'My name is ' +
          fullName +
          ", I'm " +
          age +
          ", and I'm not a citizen of the United Kingdom."
      );
    }
  }
  ejercicio2() {
    let x:number;
    let y:number;
    let a:number;
    x = 5;
    y = 7;
    a = x + y;
    console.log(a);
  }

  whichMonths(season:Temporada) {
    let monthsInSeason: string;
    switch (season) {
    case Temporada.Otoño:
    monthsInSeason = "September to November";
    break;
    case Temporada.Invierno:
    monthsInSeason = "December to February";
    break;
    case Temporada.Primavera:
    monthsInSeason = "March to May";
    break;
    case Temporada.Verano:
    monthsInSeason = "June to August";
    }
    console.log(monthsInSeason);
    }
     
}
