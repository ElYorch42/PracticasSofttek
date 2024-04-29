import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { entorno } from '../_modelo/entorno';
import { Observable } from 'rxjs';
import { Producto } from '../_modelo/Producto';

@Injectable({
  providedIn: 'root'
})
export class ProductosService {

  private url:string =`${entorno.HOST}/productos`;

  constructor(private http:HttpClient) { }

  obtenerTodos():Observable<Producto[]> {
    console.log("obtenerLista");
    return this.http.get<Producto[]>(this.url);
  }

  darAlta(producto:Producto){
    console.log(producto);
    console.log(this.url);
    console.log(this.http.get(this.url));
    return this.http.post(this.url,producto);
  }

}
