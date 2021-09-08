package ejercicio.variable.locales.globales;

public class Persona {
	private String nombre;
	private int edad;
	
	public static String pais="Peru";
	public static int año=2021;
	//variable
	//Enfuncio de su alcance
	//globales:se declara anivel de clase ,se subdivide en 2 (instancia y las estaticas)
	
	public void comer() {
		this.setNombre("Danilo");
		String plato="Arroz";
	}

	public String getNombre() {
		return nombre;
	}

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
