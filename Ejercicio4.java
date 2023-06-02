package Arraylist;

import java.util.Scanner;
public class Ejercicio4 {
	 public static void main(String[] args) {
	        String[] palabras = { "Hoola", "Mundo", "Java" };
	        int contador = contarVocales(palabras);
	        System.out.println("La cantidad de vocales en el array es: " + contador);
	    }

	    public static int contarVocales(String[] palabras) {
	        int contador = 0;
	        for (String palabra : palabras) {
	            contador += contarVocalesEnPalabra(palabra);
	        }
	        return contador;
	    }

	    public static int contarVocalesEnPalabra(String palabra) {
	        int contador = 0;
	        for (int i = 0; i < palabra.length(); i++) {
	            char letra = Character.toLowerCase(palabra.charAt(i));
	            if (esVocal(letra)) {
	                contador++;
	            }
	        }
	        return contador;
	    }

	    public static boolean esVocal(char letra) {
	        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
	    }
	}
	





