package Arreglos;
import java.util.*;
public class array8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float num[]= new float[5];
		float sumapo=0,sumane=0,mediapo=0,mediane=0;
		int conteopo=0,conteone=0,conteoce=0;
		
		System.out.println("Guardando los numeros en el arreglo");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+" Digite un numero ");
			num[i] = entrada.nextFloat();
			
			if(num[i] ==0) {
				conteoce++;
			}else if(num[i]>0){
				sumapo +=num[i];
				conteopo++;
			}else {
				sumane +=num[i];
				conteone++;
			}
		}
		//media de numeros positivos
		if(conteopo==0){
			System.out.println("No se puede sacar la media de los numeros pisitivos");
			
		}else {
			mediapo=sumapo/conteopo;
			System.out.println	("La media de los numeros positivos es: "+ mediapo);
		}
		
		if(conteone==0) {
			System.out.println	("No se puede sacar la media de numeros negativos ");
		}else {
			mediane=sumane/conteone;
			System.out.println	("La media de los numeros negativos es: "+mediane);
		}
		System.out.println	("Cntida de ceros es: "+conteoce);

	}

}
