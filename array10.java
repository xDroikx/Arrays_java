package Arreglos;
import java.util.*;
public class array10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int are[]= new int[10];
		boolean cre= false,decre=false;
		
		System.out.println("Llenear el arreglo");
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+" Digite un numero");
			are[i] = entrada.nextInt();
		}
		for(int i=0;i<9;i++){
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
		}else if(cre==true&&decre==true){
			System.out.println("\nEl arreglo esta desordenado");
		}else if(cre==false&&decre==false){
			System.out.println("\ntodos los numeros son iguales");
		}
			
		
		
	}

}
