import { Routes } from '@angular/router';
import { FormularioComponent } from './formulario/formulario.component';
import { ListaComponent } from './lista/lista.component';

export const routes: Routes = [
    {path:'lista', component:ListaComponent,children:[
        {path:'formulario',component:FormularioComponent},
        {path:'edicion/:id', component:FormularioComponent}
    ]},
    {path:'', redirectTo:'lista', pathMatch:'full'}
];
