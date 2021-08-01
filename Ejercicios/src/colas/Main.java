package Ejercicios.src.colas;

public class Main {

    public static void main(String[] args) {

        // Constantes
        final double ENTRADA_5_10_AÑOS = 40;
        final double ENTRADA_11_17_AÑOS = 60;
        final double ENTRADA_18_AÑOS = 80;

        // Creo la cola
        ColaDinamica<Persona> colaCine = new ColaDinamica<>();

        // Relleno la cola
        rellenarCola(colaCine);

        double cantidadRecaudada = 0;

        Persona p;

        // Recorro la lista
        while (!colaCine.isEmpty()) {
            // Saco la primera persona
            p = colaCine.dequeue();

            // Segun la edad de la persona cambiara el precio de la entrada
            if (p.getEdad() >= 5 && p.getEdad() <= 10) {
                cantidadRecaudada += ENTRADA_5_10_AÑOS;
            } else if (p.getEdad() >= 11 && p.getEdad() <= 17) {
                cantidadRecaudada += ENTRADA_11_17_AÑOS;
            } else {
                cantidadRecaudada += ENTRADA_18_AÑOS;
            }

        }

        System.out.println("Se ha recaudado " + cantidadRecaudada + " pesos");

    }

    // Metodo que nos permite rellenar la cola dinamica
    public static void rellenarCola(ColaDinamica<Persona> cola) {

        // Genero el numero de personas entre 1 y 50
        int numPersonas = Metodos.generaNumeroAleatorio(1, 50);

        System.out.println("Se van a generar " + numPersonas + " personas");

        Persona p;
        int edad;
        for (int i = 0; i < numPersonas; i++) {

            // Genero la edad de la persona
            edad = Metodos.generaNumeroAleatorio(5, 60);

            // Creo la persona
            p = new Persona(edad);

            System.out.println("Se ha generado una persona con " + p.getEdad() + " años");

            // Se añade añade a la cola
            cola.enqueue(p);

        }

    }

}