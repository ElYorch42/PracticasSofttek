import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ej1',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './ej1.component.html',
  styleUrl: './ej1.component.css'
})
export class Ej1Component {
  email: string ='';
  password: string = '';
  repeatPassword: string = '';
  mensaje: string = '';

  validatePassword() {
    if (this.password === this.repeatPassword) {
      this.mensaje = 'Bienvenido';
    } else {
      this.mensaje = 'Usuario o contraseña inválidos';
    }
  }
}
