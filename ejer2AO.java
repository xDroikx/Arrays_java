package arrayobjeto;

public class ejer2AO {

	public static void main(String[] args) {
		Empleados []Empleado= {
				new Empleados("Juan",5528.58,8),
				new Empleados("Juan",5154.34,3),
				new Empleados("Juan",5328.54,6),
		};
		for (Empleados empleado : Empleado) {
			empleado.salarioactualizado();
			System.out.println("++++++++++++++");
            System.out.println("El empleado: " + empleado.getNombre()
            + " antiguedad : " + empleado.getAntiguedad()
            + " tiene un salario de : " + empleado.salarioactualizado() );
            System.out.println("++++++++++++++");
		}

		
		
	}

}
