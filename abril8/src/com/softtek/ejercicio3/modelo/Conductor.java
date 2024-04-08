package com.softtek.ejercicio3.modelo;

public class Conductor {
    private IVehiculo vehiculo;

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor() {
    }

    public String conducir() {
        return vehiculo.moverse();
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
