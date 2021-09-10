package consultorio.medico;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector=new Scanner(System.in);
		int opcion=0;
		
		Paciente [] Lista=new Paciente[3];
		
		do {
			System.out.println();
		 	System.out.println("** Consultorio Medico ***");
			System.out.println("1. Registrar paciente");
			System.out.println("2. Imprimir reporte");
			System.out.println("3. Salir");
			System.out.print("Escoja opcion:");
			opcion=lector.nextInt();
			
			if(opcion==1) {
				lector.nextLine();
				System.out.println();
				System.out.println("------------------------------------------------");
				for(int i=0;i<Lista.length;i++) {
					
					System.out.print("Ingrese nombre del paciente:");
					String nombre=lector.nextLine();
					System.out.print("Ingrese apellido del paciente:");
					String apellido=lector.nextLine();
					System.out.print("Ingrese edad del paciente:");
					int edad=lector.nextInt();
					System.out.print("Síntoma del paciente:");
					lector.nextLine();
					String sintoma=lector.nextLine();
					System.out.println("-------------------------------------------------");
					
					Lista[i]=new Paciente(nombre, apellido, edad, sintoma);
				}
			
			}else if(opcion==2) {
				
	
				Arrays.sort(Lista);
				
				System.out.println("\n\t\t >>Rgistro de Pacientes<<<");
				
				System.out.println(Arrays.toString(Lista));
			}
			
			
		}while(opcion!=3);
	}

}
