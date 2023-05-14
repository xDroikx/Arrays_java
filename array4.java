package Arreglos;

public class array4 {

	public static void main(String[] args) {
		
		int[]matrizale=new int [150];
		
		for(int i =0;i<matrizale.length;i++) {
			
			matrizale[i]=(int)Math.round(Math.random()*100);
		}

		for(int num:matrizale) {
			
			System.out.print(num+" ");
		}
		
	}

}
