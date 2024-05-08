import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject, map } from 'rxjs';
import { Producto } from '../_modelo/Producto';

@Injectable({
  providedIn: 'root'
})
export class ProductosService {
  private url:string =`http://localhost:8080/productos`;
  productoCambio = new Subject<Producto[]>();

  constructor(private http:HttpClient) { }

  listar():Observable<Producto[]> {
    return this.http.get<Producto[]>(this.url)
    .pipe(map(data => {return data.sort((a,b) => a.idProducto-b.idProducto)}));
  }

  listarPorId(id:number) {
    return this.http.get<Producto>(`${this.url}/${id}`);
  }

  alta(p:Producto) {
    console.log(p);
    return this.http.post(this.url,p);
  }

  modificar(p:Producto) {
    console.log(p);
    return this.http.put(this.url,p);
  }

  eliminar(id:number) {
    return this.http.delete(`${this.url}/${id}`);
  }
}
