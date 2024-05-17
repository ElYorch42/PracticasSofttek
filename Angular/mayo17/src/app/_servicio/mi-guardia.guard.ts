import { CanActivateFn, Router } from '@angular/router';
import { LoginService } from './login.service';
import { inject } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';
import { entorno } from '../_environment/entorno';

export const miGuardiaGuard: CanActivateFn = (route, state) => {
  
  const loginService = inject(LoginService);
  const router = inject(Router);
  const jwtHelper = inject(JwtHelperService);

  let rpta = loginService.estaLogeado();

  if (!rpta) {
    console.log('no esta logeado');
    loginService.cerrarSesion();
    return false;
  } else {
    let token = sessionStorage.getItem(entorno.TOKEN_NAME);
    if (!jwtHelper.isTokenExpired(token)) {
      console.log('no ha expirado el toke');
      return true;
    } else {
      loginService.cerrarSesion();
      return false;
    }
  }
};
