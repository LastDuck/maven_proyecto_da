package ejercicio.nonacces.staticos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente P1=new Paciente();
		P1.setNombre("Pablo");
		P1.setEdad(15);
		
		P1.registra(P1.getNombre());
		Paciente.consultarNacionalida(); //la forma corecta de utilizar metodos staticos es por medio de la clase y no de la instancia (Aunque no de error)
		P1.consultarNacionalida();
	}

}
