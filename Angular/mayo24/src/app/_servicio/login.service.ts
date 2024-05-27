import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { entorno } from '../_environment/entorno';
import { JwtAuthenticationResponse } from '../_modelo/JwtAuthenticationResponse';
import { SignInRequest } from '../_modelo/signin_request';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  autenticar(datos:SignInRequest) {
    return this.http.post<JwtAuthenticationResponse>(`${entorno.HOSTNAME}/auth/signin`,datos);
  }

  estaLogeado() {
    let token = sessionStorage.getItem(entorno.TOKEN_NAME);
    return token != null;
  }
  cerrarSesion() {
    sessionStorage.clear();
  }
}
