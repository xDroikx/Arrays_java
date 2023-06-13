package arrayobjeto;

public class ejer1AO {

	public static void main(String[] args) {
	
	
		    double [] calificacionesJose = {8.8,7.5,5.6};
	        double [] calificacionesLuis = {9.8,8.0,7.6};
	        double [] calificacionesEdu = {10.0,10.2,0};
	        Estudiantes[] Estudiante ={
	                new Estudiantes("Jose",20,calificacionesJose),
	                new Estudiantes("Luis",33,calificacionesLuis),
	                new Estudiantes("Eduardo",18,calificacionesEdu)
	        };
	        for(Estudiantes estudiante :Estudiante){
	            System.out.println("++++++++++++++");
	            System.out.println("El estudiante: " + estudiante.getNombre()
	            + " edad : " + estudiante.getEdad()
	            + " tiene un promedio de : " + estudiante.calcularpromedio() );
	            System.out.println("++++++++++++++");
    }


}

}