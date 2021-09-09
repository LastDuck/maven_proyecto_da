package deber.string;

import java.util.Scanner;
public class Main {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				Scanner lector=new Scanner(System.in);
				int opcion=0;
				String cedula = "";
				
				Estudiante [] Lista=new Estudiante[5];
				Estudiante E1=new Estudiante(cedula);
				Estudiante E2=new Estudiante(cedula);
				Estudiante E3=new Estudiante(cedula);
				Estudiante E4=new Estudiante(cedula);
				Estudiante E5=new Estudiante(cedula);
			
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
								Lista[i]=new Estudiante(cedula);					
								 
								}
							
								
						}else if(opcion==2) {
							 lector.nextLine();
								System.out.print("Ingrese Cedula del Estudiante a Encontrar: ");
								 String cedulaBuscar=lector.nextLine();
						boolean respuesta=false;
							 for(int i=0;i<5;i++) {
								Estudiante studt=Lista[i];
								studt.getCedula();
								
								boolean respuestalocal=cedulaBuscar.equals(studt.getCedula());
								
								if(respuestalocal==true) {
									respuesta=true;
								}
							 }
							 if(respuesta=true) {
								 System.out.println("Si");
							 }else {
								 System.out.println("No");
							 }
						}
					 
				 }while( opcion!=3);
			
	}

}
