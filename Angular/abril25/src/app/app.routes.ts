import { Routes } from '@angular/router';
import { ListaProductosComponent } from './lista-productos/lista-productos.component';
import { FormularioProductoComponent } from './formulario-producto/formulario-producto.component';

export const routes: Routes = [
    {path:'lista-productos',component:ListaProductosComponent},
    {path:'formulario-producto', component:FormularioProductoComponent},
    {path:'', redirectTo:'lista-productos',pathMatch:'full'}
];
