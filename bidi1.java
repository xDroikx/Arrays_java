package Arreglos;

public class bidi1 {

	public static void main(String[] args) {
		
	int[][]matriz=new int [4][5];
	
	matriz[0][0]=23;
	matriz[0][1]=54;
	matriz[0][2]=12;
	matriz[0][3]=65;
	matriz[0][4]=68;

	matriz[1][0]=65;
	matriz[1][1]=52;
	matriz[1][2]=56;
	matriz[1][3]=14;
	matriz[1][4]=65;
	
	matriz[2][0]=4;
	matriz[2][1]=76;
	matriz[2][2]=83;
	matriz[2][3]=38;
	matriz[2][4]=92;
	
	matriz[3][0]=85;
	matriz[3][1]=97;
	matriz[3][2]=37;
	matriz[3][3]=18;
	matriz[3][4]=15;
	
	//System.out.println("valor almacenado en la posicion 2-3: "+matriz[2][3]);
	
	for(int i = 0;i<4;i++){
		System.out.println();
		for (int j=0;j<5;j++){
			
			System.out.print(matriz[i][j]+" ");
		}
		
		
	}
	
	
	
	
	
	}

}
