package Arreglos;
import java.util.*;
public class array13 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);		
	int are[]= new int[10];
	int conteopar=0,conteoinpar=0;
	
	System.out.println("Llenar el arreglo");
	for(int i=0;i<10;i++) {
		System.out.print((i+1)+" Digite un numero ");
		are[i] = entrada.nextInt();
		
		if(are[i]  % 2==0 ){
			conteopar++;
		}else{
			conteoinpar++;
		}
	}
	
	int par[]= new int[conteopar];
	int inpar[]= new int[conteoinpar];
	//reutilizacion de variables
	conteopar=0;
	conteoinpar=0;
	
	for(int i=0;i<10;i++){
		if(are[i]%2==0){
			par[conteopar]=are[i];
			conteopar++;
			
		}else{
			inpar[conteoinpar]=are[i];
			conteoinpar++;
		}
	}
	System.out.println("\nArreglo par");
	for(int i=0;i<conteopar;i++){
		System.out.println(par[i]+" - ");
	}
	System.out.println("");
	
	System.out.println("\nArreglo inpar");
	for(int i=0;i<conteoinpar;i++){
		System.out.println(inpar[i]+" - ");
	}
	System.out.println("");
	
	
	
	
	
	
	
}

}
