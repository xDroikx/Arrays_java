package Arraylist;


/*Ejercicio 2: Buscar el número máximo en un array
Enunciado: Escribí un programa que encuentre el
número máximo en un array de enteros.*/

import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args){
		
		int[] nums = { 54, 6, 76, 23, 89};
		int numeromaximo = nums[0];
		
		   
		 for(int i=0;i<nums.length;i++){
			   
			 if(nums[i]>numeromaximo){
				numeromaximo=nums[i]; 
			 
			/* if(numeromaximo>nums[0]){
				numeromaximo= nums[0];
			 }*/
		 }
		}
		 System.out.println("El numero maximo es: "+numeromaximo);	 
		 
		 
		 
		 //System.out.println();
	}	 	 
}


