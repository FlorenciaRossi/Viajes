package viajesEspecializados;

public abstract class Viaje {
    String origen;
    String destino;
    protected double distancia;
    protected int cantEstaciones;
    int cantVagones;
    protected int cantMaxPasajeros;

    public Viaje(String origen, String destino, double distancia, int cantEstaciones, int cantVagones, int cantMaxPasajeros){
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.cantEstaciones = cantEstaciones;
        this.cantVagones = cantVagones;
        this.cantMaxPasajeros = cantMaxPasajeros;
    }


    abstract public double tiempoDemora();
  
}
