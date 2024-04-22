import { Routes } from '@angular/router';
import { Ejercicio1BlogComponent } from './ejercicio1-blog/ejercicio1-blog.component';
import { Ejercicio1ArticuloComponent } from './ejercicio1-articulo/ejercicio1-articulo.component';
import { Ejercicio2ArticuloComponent } from './ejercicio2-articulo/ejercicio2-articulo.component';

export const routes: Routes = [
    {path:"blog", component:Ejercicio1BlogComponent},
    {path:"articulo1/:id", component:Ejercicio1ArticuloComponent},
    {path:"articulo2/:id",component:Ejercicio2ArticuloComponent}
    
];
