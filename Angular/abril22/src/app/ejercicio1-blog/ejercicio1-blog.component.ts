import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Inmueble } from '../_modelo/inmueble';
import { InmuebleService } from '../_servicio/inmueble.service';

@Component({
  selector: 'app-ejercicio1-blog',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './ejercicio1-blog.component.html',
  styleUrl: './ejercicio1-blog.component.css'
})
export class Ejercicio1BlogComponent {
    listaInmuebles:Inmueble[] =[];

    constructor(private inmuebleServicio:InmuebleService) {}

    ngOnInit(): void {
        this.listaInmuebles = this.inmuebleServicio.obtenerTodos();
    }
}
