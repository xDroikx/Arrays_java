package Arreglos;
import java.util.*;
public class array14 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	
	int are[],num;
	are= new int[10];
	boolean cre = true;
	
	do{
		System.out.println("Rellene el arreglo");
		for(int i=0;i<10;i++) {
			System.out.print(i+" Digite un numero ");
			are[i] = entrada.nextInt();
		}
		for(int i=0;i<9;i++){
			if(are[i]<are[i+1]) {
				cre = true;
				
			}
			if(are[i]>are[i+1]) {
				cre = false;
				break;
			}
		}
		if(cre == false) {
			System.out.print("\nEl arreglo esta desordemado");
		}
			
			
			
	}while(cre == false);
	
	//se pide el num a buscar
	System.out.print("\nDigite el numero a buscar en el arreglo");
	num = entrada.nextInt();
	
	int i=0;
	while(i<10 && are[i]<num) {
		i++;
	}
	if(i==10){
	System.out.print("\nNumero no encontrado");
	
	}else if(are[i]==num){
		System.out.print("\nNumero encontrado,en la posicion "+are[i]);
	}else{
		System.out.print("\nNumero no encontrado");
	}
		
}
}
