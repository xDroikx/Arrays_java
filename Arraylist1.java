package Arraylist;
import java.util.*;
public class Arraylist1 {

	
	public static void main(String[] args) {
	
	ArrayList <Empleado> listaEmpleados=new ArrayList<Empleado>();
	
	//listaEmpleados.ensureCapacity(6);
	
	listaEmpleados.add(new Empleado("Ana",45,2500));
	listaEmpleados.add(new Empleado("Antonio",55,2000));
	listaEmpleados.add(new Empleado("Maria",25,2600));
	listaEmpleados.add(new Empleado("Sandra",55,2700));
	listaEmpleados.add(new Empleado("Sandra",55,2700));
	
	//listaEmpleados.trimToSize();
	
	System.out.print(listaEmpleados.size());
	
	for(Empleado e: listaEmpleados){
		System.out.println(e.dameDatos());
	}
	
	
	}

	
}
	
	class Empleado{
	
		public Empleado(String nombre,int edad,double salario){
			
			this.nombre=nombre;
			
			this.edad=edad;
			
			this.salario=salario;
			
		}
		
		public String dameDatos(){
			
			return"El empleado se llama "+nombre+" Tiene "+edad+" años "+" Y un salario de "+salario;
		}
		private String nombre;
		
		private int edad;
		
		private double salario;
		
	}
		
	
		
		
		
		
	


