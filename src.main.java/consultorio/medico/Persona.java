package consultorio.medico;



public class Persona  implements Comparable <Persona>{

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre,String apellido,int edad) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		if(this.edad<o.getEdad()) {
			return 1;
		}else if(this.edad==o.getEdad()) {
			return 0;
		}else {
			return -1;
		}
		
	
	}
}


