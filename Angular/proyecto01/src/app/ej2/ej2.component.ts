import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ej2',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './ej2.component.html',
  styleUrl: './ej2.component.css'
})
export class Ej2Component {
  descripcion:string = '';
  codigo:string = '';
  precioCosto:number = 0;
  precioVenta:number = 0;
  stockIdeal:number = 0;
  mensaje:string = '';
ingresar() {
  if (this.precioCosto >0 && this.precioVenta >0 && this.stockIdeal >0) {
      this.mensaje = 'Producto dado de alta';
  } else {
    this.mensaje = 'Los precios o el stock es inferior a 0'
  }
}

}
