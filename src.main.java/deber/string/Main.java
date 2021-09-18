package deber.string;

import java.util.Scanner;
public class Main {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				Scanner lector=new Scanner(System.in);
				int opcion=0;
				String cedula = "";
				
				Estudiante [] Lista=new Estudiante[5];
			
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
								Lista[i]=new Estudiante(cedula);					
				
								}			
								
						}else if(opcion==2) {
							 lector.nextLine();
								System.out.print("Ingrese Cedula del Estudiante a Encontrar: ");
								 String cedulaBuscar=lector.nextLine();
								 String cedula1="";
						
								for(int i=0;i<Lista.length;i++) {
								Estudiante studt=Lista[i];
								 cedula1=studt.getCedula();
								
								
								if(cedulaBuscar.equals(cedula1) && cedulaBuscar==cedula) {
									System.out.println("Se encontro");
									
								}else {
									System.out.println("No Se encontro");
								}
							 }							 
						}
					 
				 }while( opcion!=3);
	}

}
