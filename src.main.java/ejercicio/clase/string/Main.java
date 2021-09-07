package ejercicio.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 contains
		String frase="El que madruga Dios le ayuda";
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		String palabra=lector.nextLine();
		boolean resultado =frase.contains(palabra);
		System.out.println("Contiene la palabra: "+resultado);
	
		//2 equals
		System.out.println("--------------------");
		String cadena1="LastDuck";
		System.out.println("Ingrese la 2 cadena a conparar: ");
		String cadena2=lector.nextLine();
		boolean r2 =cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales : "+ r2);
		System.out.println("--------------------");
		//3 y 4upper ,lower
		String nombre="LastDuck";
		String NM=nombre.toUpperCase();
		System.out.println("Nombre en mayuscula: "+NM);
		
		String nombre1="LastDuck";
		String mm=nombre1.toLowerCase();
		System.out.println("Nombre en minuscula: "+mm);
	}

}
