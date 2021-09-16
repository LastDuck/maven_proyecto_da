package deber.nonacces.finalll;

public  class DoctorGeneral extends Doctor {

	public final String horaEngrada="08:30";
	public String horaSalida="22:00";
	
	public DoctorGeneral() {
		//horaEngrada="09:00";  //al estar un atributo en final este no se puede reasignar los valores puesto anteriormente.
		horaSalida="21:30";
	}
	protected final void realizarCirugia() {
		System.out.println("El doctor realizo 40 horas de ciruguas:");
	}
	
	protected void analizarCasos() {
		System.out.println("El doctor realizo 30 horas de casos medicos:");
	}
}
