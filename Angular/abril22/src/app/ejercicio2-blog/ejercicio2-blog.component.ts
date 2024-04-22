import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Articulo } from '../_modelo/articulo';

@Component({
  selector: 'app-ejercicio2-blog',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './ejercicio2-blog.component.html',
  styleUrl: './ejercicio2-blog.component.css'
})
export class Ejercicio2BlogComponent {

  listaArticulos:Articulo[] = [
    {id:1,titulo:'Hacking etico',descripcion:'descripcion',imagenURL:'https://s.rfi.fr/media/display/cda3201c-b406-11eb-b4c1-005056bff430/w:1280/p:4x3/hacker-2883632_1920_web.jpg'},
    {id:2,titulo:'Legislacion de Seguridad en Europa',descripcion:'descripcion',imagenURL:'https://s.rfi.fr/media/display/cda3201c-b406-11eb-b4c1-005056bff430/w:1280/p:4x3/hacker-2883632_1920_web.jpg'},
    {id:3,titulo:'¿Como evitar que te hackeen la cuenta?',descripcion:'descripcion',imagenURL:'https://s.rfi.fr/media/display/cda3201c-b406-11eb-b4c1-005056bff430/w:1280/p:4x3/hacker-2883632_1920_web.jpg'},
    {id:4,titulo:'¿Que es el phising?',descripcion:'descripcion',imagenURL:'https://s.rfi.fr/media/display/cda3201c-b406-11eb-b4c1-005056bff430/w:1280/p:4x3/hacker-2883632_1920_web.jpg'}
  ];

  crearArticulo() {
    let nombreTitulo = String(prompt("Introduce el titulo"));
    let desc = String(prompt("Introduce la descripcion"));
    let ultimoId = this.listaArticulos[this.listaArticulos.length-1].id
    let nuevoArticulo:Articulo = {id:ultimoId+1,titulo:nombreTitulo,descripcion:desc,imagenURL:''};
    this.listaArticulos.push(nuevoArticulo);
  }
}
