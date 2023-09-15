package viajesEspecializados;

public class AltaVelocidad extends Viaje{

    public AltaVelocidad(String origen, String destino, double distancia, int cantEstaciones, int cantVagones, int cantMaxPasajeros) {
        super(origen, destino, distancia, cantEstaciones, cantVagones, cantMaxPasajeros);
    }

    @Override
    public double tiempoDemora() {
        double tiempo = this.distancia/10.0 ;
        return tiempo;
    }
}
