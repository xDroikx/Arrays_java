package Arreglos;

public class array1 {

	public static void main(String[] args) {
		int[]matriz= {5,45,34,23,56,32,65,87,34,65,23,76,43,65};
		/*int [] matriz =new int[5];
		int matr:iz2: [] =new int[5];
		
		matriz[0]=5;
		matriz[1]=11;
		matriz[2]=76;
		matriz[3]=23;
		matriz[4]=34;*/
		
		System.out.println(matriz[0]);
		System.out.println(matriz[1]);
		System.out.println(matriz[2]);
		System.out.println(matriz[3]);
		System.out.println(matriz[4]);
		
		for(int i = 0;i < matriz.length;i++){
			System.out.println("Valor del indice "+i+" es "+matriz[i]);
		}
	}

}
