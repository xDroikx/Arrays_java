package arrayobjeto;

public class Estudiantes {

	private String nombre;
	
	private int edad;
	
	private double[]Calificaciones;
	
	public
	Estudiantes(String n, int e, double[]c){
	        nombre = n;
	        edad = e;
	        Calificaciones = c;
	    }
	
	public String getNombre(){
		return nombre;
	}
	
	public int getEdad(){
		return edad;
	}
	public double[] getCalificaciones(){
		return Calificaciones;
	}
	
	void setNombre(String n){
		nombre =n;
	}
	void setEdad(int e){
		edad =e;
	}
	void setCalificaciones(double[]c){
		Calificaciones =c;
	}
	
	public double calcularpromedio() {
		double suma = 0;
		for (double Calificacion :Calificaciones) {
			suma+= Calificacion;
		}
		double prom =suma/Calificaciones.length;
		return prom;
	}
}
