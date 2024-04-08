package com.softtek.ejercicio1.vista;

import com.softtek.ejercicio1.modelo.*;

public class Main {
    public static void main(String[] args) {
        //¿Qué ocurre si no implemento todos los métodos?
        //No funciona
        //¿Puedo crear instancias igualmente?
        //si lo que no se puede crear es un animal directamente
        //¿Puedo modificar parte de la definición de los métodos abstractos?
        //si mediante un override
        //¿Puedo utilizar polimorfismo?
        //Si se puede pero no con metodos abstractos

        Perro perro = new Perro();
        Pajaro pajaro = new Pajaro();
        Pez pez = new Pez();
        Gusano gusano = new Gusano();
        Mastin mastin =new Mastin();
    }
}
