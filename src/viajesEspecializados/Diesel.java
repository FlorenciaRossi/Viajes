package viajesEspecializados;

import viajeAbstracto.Viaje;

public class Diesel extends Viaje {

    
    public Diesel(String origen, String destino, double distancia, int cantEstaciones, int cantVagones, int cantMaxPasajeros) {
        super(origen, destino, distancia, cantEstaciones, cantVagones, cantMaxPasajeros);
    }

    @Override
    public double tiempoDemora() {
        double tiempo =  ( ( (this.distancia * this.cantEstaciones)/2 ) + (this.cantEstaciones  + cantMaxPasajeros)/10.0 );
        return tiempo;
    }
    
}
