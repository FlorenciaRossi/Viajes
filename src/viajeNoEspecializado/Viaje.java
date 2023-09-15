package viajeNoEspecializado;

public class Viaje {
        String origen;
        String destino;
        protected double distancia;
        protected int cantEstaciones;
        int cantVagones;
        protected int cantMaxPasajeros;
        protected TipoDeViaje tipo;
    
        public Viaje(String origen, String destino, double distancia, int cantEstaciones, int cantVagones, int cantMaxPasajeros, TipoDeViaje tipo){
            this.origen = origen;
            this.destino = destino;
            this.distancia = distancia;
            this.cantEstaciones = cantEstaciones;
            this.cantVagones = cantVagones;
            this.cantMaxPasajeros = cantMaxPasajeros;
            this.tipo = tipo;
        }
    
        public double tiempoDemora(){
            return tipo.tiempoDemora(distancia, cantEstaciones, cantMaxPasajeros);
        }
    }

    