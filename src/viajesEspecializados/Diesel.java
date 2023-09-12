package viajesEspecializados;

public class Diesel extends TipoDeViaje {

    @Override
    public double tiempoDemora(double distancia, int cantEstaciones, int cantMaxPasajeros) {
        double tiempo =  ( ( (distancia * cantEstaciones)/2 ) + (cantEstaciones  + cantMaxPasajeros)/10.0 );
        return tiempo;
    }
    
}
