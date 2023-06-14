package arrayobjeto;

public class Empleados {


		private String nombre;
		
		private double salario;
		
		private int antiguedad;
		
		public
		Empleados(String n, double s, int a){
		        nombre = n;
		        salario = s;
		        antiguedad = a;
		    }
		
		public String getNombre(){
			return nombre;
		}
		
		public double getSalario(){
			return salario;
		}
		public int getAntiguedad(){
			return antiguedad;
		}
		
		void setNombre(String n){
			nombre =n;
		}
		void setSalario(double s){
			salario =s;
		}
		void setAntiguedad(int a){
			antiguedad =a;
		}
		
		public double salarioactualizado() {
			if (antiguedad>5){  //condition ? expressionIfTrue : expressionIfFalse
					salario*=1.10;
					
		}
			return salario;	
		}
}
