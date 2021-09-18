package ejercicios.seleccion.switchs;

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
		
			switch(opcion) {
			
			case "1":
				System.out.println("Ingrese cuenta:");
			break;
			case "2":
				System.out.println("No existe transferencia");
				break;
			case "3":
				System.out.println("Cerrando sistemas");
				break;
		
			default:
				System.out.println("No a eligido ninguna opcion");
				break;
			}
		
		}while(!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}

}
