package ejercicio.nonacces.staticos;

public class Paciente {

	private String nombre;
	private int edad;
	private static String nacionalidad="Ecuatoriano";
	private static int edadLimite;
	public String getNombre() {
		return nombre;
	}
		public void registra(String nombre) {
			System.out.println("Se registro el paciente: "+nombre);
		}
		
		public static void consultarNacionalida() {
			System.out.println("La nacionalida es :" +nacionalidad);
		}
		//metodo set y gett
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
