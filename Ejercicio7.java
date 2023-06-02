package Arraylist;
/*Ejercicio 3: Contar la cantidad de números pares
en un array.
Enunciado: Escribí un programa que cuente la
cantidad de números pares en un array de
números enteros.*/



public class Ejercicio7 {

	public static void main(String[] args) {
		int[] nums = { 54, 6, 76, 23, 89,53};
		int inpar=0;
		int par=0;
		for(int i=0;i<nums.length;i++){
			 
			 if(nums[i]% 2 ==0){
				par++; 
		 }else{
			inpar++; 
		}
		   
		
	}
		 System.out.println("Numero total de pares: "+par);
		 System.out.println("Numero total de inpares: "+inpar);
}
}