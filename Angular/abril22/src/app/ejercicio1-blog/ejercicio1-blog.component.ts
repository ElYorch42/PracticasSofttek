import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-ejercicio1-blog',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './ejercicio1-blog.component.html',
  styleUrl: './ejercicio1-blog.component.css'
})
export class Ejercicio1BlogComponent {
  listaInmuebles = [
    {
        id: 1,
        nombre: "Casa en la playa"
    },
    {
        id: 2,
        nombre: "Apartamento en el centro de la ciudad"
    },
    {
        id: 3,
        nombre: "Finca en el campo"
    },
    {
        id: 4,
        nombre: "Piso en zona residencial"
    },
    {
        id: 5,
        nombre: "Chalet en las montañas"
    }
];
}
