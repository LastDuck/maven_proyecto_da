package consultorio.medico;

public class Paciente extends  Persona{

	private String sintoma;

	public Paciente(String nombre, String apellido, int edad,String sintoma) {
		super(nombre, apellido, edad);
		this.sintoma=sintoma;
	}
	
@Override
	public String toString() {
		return  "\n" + "Paciente Nombre: " + super.getNombre() + "\t\tApellido: " + super.getApellido() + "\t\tEdad: " + super.getEdad() +"\t\tSintoma: " + sintoma ;
	}

	//	s
	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
}
