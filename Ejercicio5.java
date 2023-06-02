package Arraylist;
import java.util.*;
public class Ejercicio5 {

	/*Ejercicio 5: Calcular el promedio de calificaciones
	Enunciado: Escribe un programa que lea las
	calificaciones de un grupo de estudiantes y
	calcule el promedio. Utilizando un array para
	almacenar las calificaciones.*/
	
	public static void main(String[] args) {
	   int suma= 0;
	   int[] calificaciones = { 4, 7, 8, 6,8};
       for (int calificacion : calificaciones ){
    	   suma +=calificacion;
    	   
    	   
    	   
    	   /*for(int i;i<calificacion.length;i++){
    	   }*/
        
    }
       System.out.println(suma);
       double promedio =0;
       promedio = (double)suma/calificaciones.length;
       System.out.println(promedio);
       
    		   
       
	    }
	
	
}
