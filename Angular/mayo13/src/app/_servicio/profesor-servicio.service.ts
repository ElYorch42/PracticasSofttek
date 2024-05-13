import { Injectable } from '@angular/core';
import { Profesor } from '../_modelo/profesor';
import { Observable, Subject, map } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProfesorServicioService {

  private url:string =`http://localhost:8080/profesores`;
  profesorCambio = new Subject<Profesor[]>();

  constructor(private http:HttpClient) { }

  listar():Observable<Profesor[]> {
    return this.http.get<Profesor[]>(this.url)
    .pipe(map(data => {return data.sort((a,b) => a.id-b.id)}));
  }

  listarPorId(id:number) {
    return this.http.get<Profesor>(`${this.url}/${id}`);
  }

  alta(p:Profesor) {
    console.log(p);
    return this.http.post(this.url,p);
  }

  modificar(p:Profesor) {
    console.log(p);
    return this.http.put(this.url,p);
  }

  eliminar(id:number) {
    return this.http.delete(`${this.url}/${id}`);
  }
}
