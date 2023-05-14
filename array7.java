package Arreglos;
import java.util.*;
public class array7 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		float num[] = new float[5];
		
		System.out.println("Guardando los datos del arreglo");
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+" Digite un numero");
			num[i]= entrada.nextFloat();
			}
		System.out.println(("\nImprimir los elementos del arreglo"));
		for(float i : num){
			System.out.println(i);		
			}

	}

}
