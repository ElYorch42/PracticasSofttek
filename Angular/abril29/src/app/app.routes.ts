import { Routes } from '@angular/router';
import { AltaProductosComponent } from './alta-productos/alta-productos.component';
import { ListaProductosComponent } from './lista-productos/lista-productos.component';

export const routes: Routes = [
    {path:'', component:ListaProductosComponent, children:[
        {path:'alta',component:AltaProductosComponent},
        {path:'edicion/:id', component:AltaProductosComponent}
    ]}
    
];
