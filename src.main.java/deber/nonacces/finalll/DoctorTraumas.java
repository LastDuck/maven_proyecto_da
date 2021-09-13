package deber.nonacces.finalll;

public  final class DoctorTraumas extends DoctorGeneral {

	public  void realizarCirugia() {
		System.out.println("El doctor realizo 80 horas de ciruguas:"); //no se puede sobreescribir un metodo final del la clase padre.
	}
	
	protected void analizarCasos() {
		System.out.println("El doctor realizo 80 horas de casos medicos:");
	}
}
