package ejercicio.fechas;

import java.time.LocalDate;

public class CursoVacacional {

	private String nombre;
	private  LocalDate fechaInicio;
	private  LocalDate fechafinal;
	private Instructor instructor;


	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechafinal() {
		return fechafinal;
	}
	public void setFechafinal(LocalDate fechafinal) {
		this.fechafinal = fechafinal;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

}
