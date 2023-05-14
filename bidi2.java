package Arreglos;

public class bidi2 {

	public static void main(String[] args) {
		
		int [][]matriz={
				{10,15,18,19,21},
				{55,32,25,2,64},
				{75,32,42,14,64},
				{20,43,65,16,84},
		};
		
		for(int[]fila:matriz){
			System.out.println();
			for(int z: fila) {
				System.out.print(z+" ");
			}
		}
		
		
		

	}

}
