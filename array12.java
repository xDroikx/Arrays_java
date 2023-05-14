package Arreglos;
import java.util.*;
public class array12 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	
	int are[]= new int[10];
	boolean cre=true;
	int num,sitio=0;
	int j=0;
	System.out.println("Llenar el arreglo");
	do {
	for(int i=0;i<5;i++) {
		
		System.out.print((i+1)+" Digite un numero ");
		are[i] = entrada.nextInt();
	
	}	
	//compobrando en forma creciennte
	for( int i=0;i<4;i++) {
		
		if(are[i]<are[i+1]){
			cre= true;
		}
		if(are[i]>are[i+1]){
			cre=false;
			break;
		}
		
	}
	if(cre==false) {
	System.out.print("\nEl arreglo no esta en forma creciente,reingrese ");
	}
	}while(cre==false);	
	System.out.print("\nDigite elemento a insertar ");	
	num = entrada.nextInt();
	//esto es para ver en que posicion esta el numero
	while(are[j]<num&&j<5){
		sitio++;
		j++;
	}
	for(int i=4;i>=sitio;i--) {
		are[i+1]=are[i];
	}
	are[sitio]=num;
	
	System.out.print("\nEl arreglo queda: " );
	for(int i=0;i<6;i++) {
		System.out.print(are[i]+" - ");
	}
	System.out.println();
	}

}
