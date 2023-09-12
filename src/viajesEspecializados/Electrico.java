package viajesEspecializados;

public class Electrico extends TipoDeViaje {

    @Override
    public double tiempoDemora(double distancia, int cantEstaciones, int cantMaxPasajeros) {
        double tiempo = (distancia * cantEstaciones)/2.0 ;
        return tiempo;
    }
}
