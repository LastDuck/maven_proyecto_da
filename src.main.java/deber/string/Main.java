package deber.string;

import java.util.Scanner;
public class Main {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				Scanner lector=new Scanner(System.in);
				int opcion=0;
				String cedula = null;
		
				Estudiante [] Lista=new Estudiante[5];
				Estudiante E1=new Estudiante();
				Estudiante E2=new Estudiante();
				Estudiante E3=new Estudiante();
				Estudiante E4=new Estudiante();
				Estudiante E5=new Estudiante();
			
				E1.setCedula(cedula);
				E2.setCedula(cedula);
				E3.setCedula(cedula);
				E4.setCedula(cedula);
				E5.setCedula(cedula);
				Lista[0]=E1;
				Lista[1]=E2;
				Lista[2]=E3;
				Lista[3]=E4;
				Lista[4]=E5;
				 do {
					   
					 System.out.println("**  Registro d Estudiante  ***");
						System.out.println("1. Ingresar Estudiante");
						System.out.println("2. Buscar Estudiante");
						System.out.println("3. Salir");
						System.out.print("Escoja opcion:");
						opcion=lector.nextInt();
						if(opcion==1) {
							
								lector.nextLine();
								for(int i=0;i<Lista.length;i++) {
								System.out.print("Ingrese Cedula: ");
								cedula=lector.nextLine();
							
								Lista[i]=new Estudiante();
								
								
							
								}
							
								
						}else if(opcion==2) {
							lector.nextLine();
							System.out.print("Ingrese Cedula del Estudiante a Encontrar: ");
							 String cedula1=lector.nextLine();
							
								if(cedula1.equals(cedula)) {
									
									System.out.println("¡Lo hemos encontrado!");
							
						
							}else {
								System.out.println("¡No Lo hemos encontrado!");
							
							
							}
						}
					 
				 }while( opcion!=3);
			
	}

}
