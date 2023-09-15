package viajesEspecializados;

public class Main {
    
    public static void main( String [] args){
       
        //INSTANCIO UN VIAJE DIESEL
        Viaje marDelPlata = new Diesel("CABA", "Mar del Plata", 400, 4, 8, 200);
        System.out.println(marDelPlata.tiempoDemora());

        //INSTANCIO UN VIAJE ELECTRICO
        Viaje bariloche = new Electrico("CABA", "Bariloche", 1580, 10, 8, 220);
        System.out.println(bariloche.tiempoDemora());

        //INSTANCIO UN VIAJE DE ALTA VELOCIDAD
        Viaje neuquen = new AltaVelocidad("CABA", "Neuquén", 1140, 8, 6, 150);
        System.out.println(neuquen.tiempoDemora());
    }
}
