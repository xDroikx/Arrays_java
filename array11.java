package Arreglos;
import java.util.*;
public class array11 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int are[]= new int[10];
	int ult;
	System.out.println("Llenar el arreglo ");
	for(int i=0;i<10;i++) {
		
		System.out.print(i+" Digite un numero ");
		are[i] = entrada.nextInt();
	
	}
		ult =are[9];//Guarde el  ultimoelemento
		
		for(int i=8;i>=0;i--){
			are[i+1] =are[i];
		}
	
		are[0] = ult;// ultimo elemento como primero
		
		System.out.println("\nEl nuevo arreglo es: ");
		for(int i=0;i<10;i++){
			System.out.println(i+" Numero: "+are[i]);
		}
	
	

	}

}
