package Ejercicios.src.arrays_estaticos;

/* Ejercicio Programa 1 – aprenderaprogramar.com */

public class Programa1 {

  public static void main(String arg[]) {

    int[] numerodecoches = new int[24];

    int r;

    r = 2;

    numerodecoches[r] = 23;

    System.out.print("El número de coches en la hora " + r + " fue " + numerodecoches[r]);

  }

}