package ejercicio.variable.locales.globales;

public class ejemplo {

	public int suma; //variable global
	
	int A=1;  //variable local
	
	public void laSuma() {
		int n1 = 0;
		int n2 = 0;
		suma=n1+n2;
	}
}
