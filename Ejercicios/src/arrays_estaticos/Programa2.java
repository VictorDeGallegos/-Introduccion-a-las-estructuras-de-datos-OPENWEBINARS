package Ejercicios.src.arrays_estaticos;

/* Ejercicio Programa 2 – aprenderaprogramar.com */

public class Programa2 {

    public static void main(String arg[]) {

        int[] numerodecoches = new int[24];

        int a, b;

        int r;

        a = 8;

        b = 4;

        r = a / b;

        numerodecoches[r] = 23;

        System.out.print("El número de coches en la hora " + r + " fue " + numerodecoches[r]);

    }
}