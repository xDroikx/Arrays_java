package Arraylist;

public class Ejercicio3 {

	 public static String concatenarPalabras(String[] palabras) {
	        StringBuilder resultado = new StringBuilder();
	        for (String palabra : palabras) {
	            resultado.append(palabra).append(" ");
	        }
	        return resultado.toString().trim();
	    }

	    public static void main(String[] args) {
	        String[] palabras = {"Hola", "mundo", "Java", "programación"};
	        String resultadoConcatenado = concatenarPalabras(palabras);
	        System.out.println("Cadena concatenada: " + resultadoConcatenado);
	    }
	}