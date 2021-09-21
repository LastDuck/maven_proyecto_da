package ejercicio.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//deprecado:no va a existir o esta obsoleto .sql no utilizar
		//plus=aplazar dias(sumar dias)
		//minus=dia antes (restar dias)
		
		Date date =new Date();
		
		LocalDate diaHoy=LocalDate.now();
		LocalDate diaFin=diaHoy.plusDays(15);
		
		CursoVacacional curso1=new CursoVacacional();
		curso1.setNombre("Volley Principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechafinal(diaFin);
		
		
		
		
		System.out.println("NOmbre:" +curso1.getNombre());
		System.out.println("Inicio del curso: "+curso1.getFechaInicio());
		System.out.println("Fin del curso: "+curso1.getFechafinal());
		
		
		LocalDate diaHoy2=LocalDate.now();
		LocalDate diaQueInicio=diaHoy2.minusDays(2);
		LocalDate diaQueDinaliza=diaQueInicio.plusDays(20);
		
		CursoVacacional curso2=new CursoVacacional();
		curso2.setNombre("Volley Natacion");
		curso2.setFechaInicio(diaHoy);
		curso2.setFechafinal(diaFin);
		
		System.out.println("NOmbre:" +curso2.getNombre());
		System.out.println("Inicio del curso: "+curso2.getFechaInicio());
		System.out.println("Fin del curso: "+curso2.getFechafinal());
	
		//fecha especifica
		LocalDate fechaEspecificaIni=LocalDate.of(2022,2,15);
		LocalDate fechaEspecificaFin=LocalDate.of(2022,9,10);
	
		CursoVacacional curso3=new CursoVacacional();
		curso3.setNombre("karate");
		curso3.setFechaInicio(fechaEspecificaIni);
		curso3.setFechafinal(fechaEspecificaFin);
		curso3.setFechafinal(fechaEspecificaFin.plusDays(3));
		
		System.out.println("NOmbre:" +curso3.getNombre());
		System.out.println("Inicio del curso: "+curso3.getFechaInicio());
		System.out.println("Fin del curso: "+curso3.getFechafinal());
		System.out.println("fecha formateada: "+curso3.getFechafinal().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Que dia es hoy:");
		LocalDate diaHoyy=LocalDate.now();
		System.out.println(diaHoyy.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println(diaHoyy.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
	}

}
