package viajesEspecializados;

public class AltaVelocidad extends TipoDeViaje{

    @Override
    public double tiempoDemora(double distancia, int cantEstaciones, int cantMaxPasajeros) {
        double tiempo = distancia/10.0 ;
        return tiempo;
    }
}
