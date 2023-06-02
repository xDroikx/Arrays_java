package Arraylist;

import java.util.*;
/*Ejercicio 4: Comprobar si un array está ordenado
de forma ascendente
Enunciado: Escribe un programa que verifique si
un array de enteros está ordenado de forma
ascendente.*/


public class Ejercicio8 {
public static void main(String[] args) {
			
			Scanner tope = new Scanner(System.in);
			System.out.println("Digite el tamaño del array");
			int lugar = tope.nextInt();
			Scanner entrada = new Scanner(System.in);
			int are[]= new int[lugar];
			boolean cre= false,decre=false;
			
			System.out.println("Llenear el arreglo");
			for(int i=0;i<lugar;i++) {
				System.out.print((i+1)+" Digite un numero");
				are[i] = entrada.nextInt();
			}
			for(int i=0;i<lugar-1;i++){
				if(are[i] < are [i+1]){
					cre=true;
				
				}
				if(are[i] > are[i+1]){
					decre=true;
				
				}
			}
			
			if(cre==true&&decre==false){
				System.out.println("\nEl arreglo esta en forma creciente");
			}else if(cre==false&&decre==true){
				System.out.println("\nEl arreglo esta en forma decreciente");
			}else 
				System.out.println("\nEl arreglo esta desordenado");
			
				
			
			
		}

	}