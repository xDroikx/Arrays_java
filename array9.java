package Arreglos;
import java.util.*;
public class array9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int are[]= new int[10];
		int are2[]= new int[10];
		int are3[]= new int[20];
		
		//pedimos el arreglo a
		System.out.println("Digite el primere arreglo: ");
		for(int i =0;i<10;i++){
			System.out.println((i+1)+"Digite un numero ");
			are[i] = entrada.nextInt();
		}
		//pedimos el arreglo a
				System.out.println("Digite el segundo arreglo: ");
				for(int i =0;i<10;i++){
					System.out.println((i+1)+"Digite un numero ");
					are2[i]= entrada.nextInt();
				}
				int j = 0;
				for(int i=0;i<10;i++) {
					are3[j]= are[i];
					j++;
					are3[j] = are2[i];
					j++;
		}
				System.out.println("\nEl tercer arreglo es: ");
				for(int i=0;i<20;i++){
					System.out.print(are3[i]+" ");
				}
				System.out.println();
		
		
		
	}

}
