package correcion.prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector=new Scanner(System.in);
		String clave="";
		String clave1="85AB";
		
		do {
			System.out.println("Ingrese la clave: ");
			clave=lector.nextLine();
			if(clave.equals(clave1)) {
				
				
				int opcion=0;
				do {
					
				System.out.println("#################################");
				System.out.println("BANCO PRODUBANCO, elija una opción:");
				System.out.println("1. Realizar transferencia");
				System.out.println("2. Consultar transacciones");
				System.out.println("3. SALIR");
				opcion=lector.nextInt();
				if(opcion==1) {
				
				System.out.println("Ingrese una cuenta:");
				lector.nextLine();
				String cuenta=lector.nextLine();
				System.out.println("Ingrese monto:");
			int monto=lector.nextInt();
				int  SaldoD=1000;
				int SN=SaldoD-monto;
				System.out.println("Su nuevo saldo es:"+SN);
					
				}else if(opcion==2) {
					System.out.println("“En este momento se están procesando las transacciones, intente más tarde");
				}
				}while(opcion!=3);
				
				clave=lector.nextLine();
			}else {
				System.out.println("la clave no es la correcta");
			}
			
		}while(!clave.equals("-1"));
		System.out.println("“Gracias por preferirnos”.");
	}

}
