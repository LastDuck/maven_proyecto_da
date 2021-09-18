package ejercicios.selecion.ifs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector=new Scanner(System.in);
		String opcion;
		do {
			System.out.println("Escoja opcion:");
			System.out.println("1.-Realizar transferencia");
			System.out.println("2.-Consultar Transferencia");
			System.out.println("3.-Salir");
			opcion=lector.nextLine();
		
		if(opcion.equals("1")) {
			System.out.println("Ingrese cuenta:");
		}else if(opcion.equals("2")) {
			System.out.println("No existe transferencia");
		}
		
		}while(!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}

}
