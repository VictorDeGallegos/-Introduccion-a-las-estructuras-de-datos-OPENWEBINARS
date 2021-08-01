package Ejercicios.src.listas_ligadas;

class Main {
    public static void main(String[] args) {

        // Arreglo generico
        int[] arreglo_base = Helper.lista_generica_valores(20);

        // Ejecución de la lista enlazada simple
        ListaEnlazada lista = new ListaEnlazada();
        lista.crearSimple(arreglo_base);
        lista.retornaLista();

    }
}