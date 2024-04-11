import { Component } from '@angular/core';

@Component({
  selector: 'app-ts01',
  standalone: true,
  imports: [],
  templateUrl: './ts01.component.html',
  styleUrl: './ts01.component.css'
})
export class Ts01Component {
  variables():void{
    let a;
    const PI =3.1416
    a="kenai";
    let bandera = true;

    let b:string="hola";
    let c:boolean | number;
    //el | para que pueda ser cualquiera de esos 2 tipos
    console.log(a);
    console.log(PI);
    console.log(bandera);
  }

  otras():void{
    let saludo = new String("Hola Mundo");
    let lorem:string = "       Lorem ipsum, dolor sit amet consectetur adipisicing elit. Est, et dolorum. Adipisci sequi, voluptates accusamus earum magnam non pariatur odit consequuntur dicta modi. Quam soluta aliquid nam ea quod dolore.      ";

        console.log(saludo,lorem);
        console.log(
          saludo.length,
          lorem.length,
          saludo.toUpperCase(),
          saludo.toLowerCase(),
          lorem.trim(),
          lorem.trim().split(" "),
          lorem.split(","));
              //Interpolción de variables
    //Template String
    let nombre="Jorge";
    let apellido="López";
    let saludo2 = `Hola mi nombre es ${nombre} ${apellido}.`;
    console.log(saludo2);
  }
  tipoNUmber():void {
    let a = 2;
    let b = new Number(1);
    let c = 7.19;
    let d = "5.6";

    console.log(a, b);
    console.log(c.toFixed(1));
    console.log(c.toFixed(5));
    console.log(parseInt(d));
    console.log(parseFloat(d));
    console.log(typeof c, typeof d);
    console.log(c + parseInt(d));
    console.log(c + parseFloat(d));
    console.log(c + Number.parseInt(d));
    console.log(c + Number.parseFloat(d));
  }
  operadores():void{
     /*  Relacionales: >, <,   >=, <=, ==, ===, !=, !== */

     console.log(8 > 9);
     console.log(9 > 8);
     console.log(8 >= 9);
     console.log(9 >= 8);
     console.log(7 < 7);
     console.log(7 <= 7); 
 
     /*
     = 1 igual es asignación  de variable
     == 2 iguales es comparacion de valores
     === 3 igulaes es comparación de tipo de dato y de valor
     */
 
     console.log(7 == 7);
     console.log(7 === 7);
     /*console.log("7" == 7);
     
     console.log(0 == false);
     console.log("7" === 7);
     console.log(0 === false); */
  }
}
