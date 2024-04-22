import { Component, Input, SimpleChanges } from '@angular/core';
import { Articulo } from '../_modelo/articulo';

@Component({
  selector: 'app-ejercicio2-articulo',
  standalone: true,
  imports: [],
  templateUrl: './ejercicio2-articulo.component.html',
  styleUrl: './ejercicio2-articulo.component.css'
})
export class Ejercicio2ArticuloComponent {
  

  listaArticulos:Articulo[] = [
    {id:1,titulo:'Hacking etico',descripcion:'descripcion',imagenURL:'https://s.rfi.fr/media/display/cda3201c-b406-11eb-b4c1-005056bff430/w:1280/p:4x3/hacker-2883632_1920_web.jpg'},
    {id:2,titulo:'Legislacion de Seguridad en Europa',descripcion:'descripcion',imagenURL:'https://s.rfi.fr/media/display/cda3201c-b406-11eb-b4c1-005056bff430/w:1280/p:4x3/hacker-2883632_1920_web.jpg'},
    {id:3,titulo:'¿Como evitar que te hackeen la cuenta?',descripcion:'descripcion',imagenURL:'https://s.rfi.fr/media/display/cda3201c-b406-11eb-b4c1-005056bff430/w:1280/p:4x3/hacker-2883632_1920_web.jpg'},
    {id:4,titulo:'¿Que es el phising?',descripcion:'descripcion',imagenURL:'https://s.rfi.fr/media/display/cda3201c-b406-11eb-b4c1-005056bff430/w:1280/p:4x3/hacker-2883632_1920_web.jpg'}
  ];

  @Input() id:any;
  articuloSeleccionado:any = this.listaArticulos.find((articulo) => articulo.id == this.id);
}
