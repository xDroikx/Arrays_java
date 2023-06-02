package Arraylist;

public class Ejercicio2 {


    public static String buscar(String[] palabras) {
        String palabraMasLarga = "";
        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }

    public static void main(String[] args) {
        String[] palabras = {"manzana", "banana", "kiwi", "toronjas", "pera"};
        String palabraMasLarga = buscar(palabras);
        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }
}