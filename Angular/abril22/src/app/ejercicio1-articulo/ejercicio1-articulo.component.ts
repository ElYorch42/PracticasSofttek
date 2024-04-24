import { Component, Input, SimpleChanges } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { InmuebleService } from '../_servicio/inmueble.service';
import { Inmueble } from '../_modelo/inmueble';

@Component({
  selector: 'app-ejercicio1-articulo',
  standalone: true,
  imports: [],
  templateUrl: './ejercicio1-articulo.component.html',
  styleUrl: './ejercicio1-articulo.component.css',
})
export class Ejercicio1ArticuloComponent {
  
  listaInmuebles:Inmueble[] =[];

  constructor(private inmuebleServicio:InmuebleService) {}

  inmuebleSeleccionado: any;

  @Input() id:any;

  ngOnChanges(changes: SimpleChanges): void {
    console.log(this.id)
    this.inmuebleSeleccionado = this.inmuebleServicio.obtenerUno(this.id);
  }
}
