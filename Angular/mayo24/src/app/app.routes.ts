import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ContenidoComponent } from './contenido/contenido.component';
import { miguardiaGuard } from './_servicio/miguardia.guard';

export const routes: Routes = [
    {"path":"",redirectTo:"/login",pathMatch:"full"},
    {"path":"login",component:LoginComponent},
    {"path":"contenido",component:ContenidoComponent, canActivate:[miguardiaGuard]}
];