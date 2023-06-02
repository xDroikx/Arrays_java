package Arraylist;

public class Ejercicio1 {
	public static int contarletra(String[] palabras, char letra) {
	        int contador = 0;
	        for (String palabra : palabras) {
	            if (palabra.charAt(0) == letra) {
	                contador++;
	            }
	        }
	        return contador;
	    }

	    public static void main(String[] args) {
	        String[] palabras = {"manzana", "mango", "coco", "limón", "pera"};
	        char letraEspecifica = 'm';
	        int cantidadPalabras = contarletra(palabras, letraEspecifica);
	        System.out.println("Cantidad de palabras que comienzan con la letra '" + letraEspecifica + "': " + cantidadPalabras);
	    }
	}