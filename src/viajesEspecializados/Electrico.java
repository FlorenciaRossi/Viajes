package viajesEspecializados;

import viajeAbstracto.Viaje;

public class Electrico extends Viaje {
    
    public Electrico(String origen, String destino, double distancia, int cantEstaciones, int cantVagones, int cantMaxPasajeros) {
        super(origen, destino, distancia, cantEstaciones, cantVagones, cantMaxPasajeros);
    }

    @Override
    public double tiempoDemora() {
        double tiempo = (this.distancia * this.cantEstaciones)/2.0 ;
        return tiempo;
    }
}
