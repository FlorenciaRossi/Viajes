package viajeNoEspecializado;

public abstract class TipoDeViaje {
    abstract public double tiempoDemora(double distancia, int cantEstaciones, int cantMaxPasajeros);
}

class Diesel extends TipoDeViaje {

    @Override
    public double tiempoDemora(double distancia, int cantEstaciones, int cantMaxPasajeros) {
        double tiempo =  ( ( (distancia * cantEstaciones)/2 ) + (cantEstaciones  + cantMaxPasajeros)/10.0 );
        return tiempo;
    }
    
}

class Electrico extends TipoDeViaje {

    @Override
    public double tiempoDemora(double distancia, int cantEstaciones, int cantMaxPasajeros) {
        double tiempo = (distancia * cantEstaciones)/2.0 ;
        return tiempo;
    }
}

class AltaVelocidad extends TipoDeViaje{

    @Override
    public double tiempoDemora(double distancia, int cantEstaciones, int cantMaxPasajeros) {
        double tiempo = distancia/10.0 ;
        return tiempo;
    }
}

