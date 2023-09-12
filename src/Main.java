import viajeAbstracto.Viaje;
import viajesEspecializados.AltaVelocidad;
import viajesEspecializados.Diesel;
import viajesEspecializados.Electrico;
import viajesEspecializados.TipoDeViaje;

public class Main {
    
    public static void main( String [] args){
       //CREO OBJETOS DE CADA TIPO DE VIAJE
       TipoDeViaje diesel = new Diesel();
       TipoDeViaje electrico = new Electrico();
       TipoDeViaje altaVelocidad = new AltaVelocidad();
        //INSTANCIO UN VIAJE DIESEL
        Viaje marDelPlata = new Viaje("CABA", "Mar del Plata", 400, 4, 8, 200, diesel);
        System.out.println(marDelPlata.tiempoDemora());

        //INSTANCIO UN VIAJE ELECTRICO
        Viaje bariloche = new Viaje("CABA", "Bariloche", 1580, 10, 8, 220, electrico);
        System.out.println(bariloche.tiempoDemora());

        //INSTANCIO UN VIAJE DE ALTA VELOCIDAD
        Viaje neuquen = new Viaje("CABA", "Neuquén", 1140, 8, 6, 150, altaVelocidad);
        System.out.println(neuquen.tiempoDemora());
    }
}
