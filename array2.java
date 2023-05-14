package Arreglos;

public class array2 {

	public static void main(String[] args) {
		//String [] paises=new String[8];
		String[]paises={"España","Argentina","Brazil","Peru","Chile","Uruguay","Bolivia","Pararguay"};
		/*paises[0]="España";
		paises[1]="Argentina";
		paises[2]="Brazil";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Uruguay";
		paises[6]="Bolivia";
		paises[7]="Pararguay";*/

		/*for(int i=0;i<paises.length;i++){
			System.out.println("Pais "+(i+1)+" "+paises[i]);
			
			
		}*/
		int i=0;
		for(String elemento:paises){
			i++;
			System.out.println("Pais "+i+" "+ elemento);
		}
		
		
	}

}
