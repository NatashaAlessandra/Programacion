package ejercicio2;

import java.time.LocalDate;

public class Alumno {

	private String dni;
	private String nombre, apellidos;
	private String cicloFormativo, curso;
	private LocalDate fechaNacimiento;

	public Alumno(String dni, String nombre, String apellidos, String cicloFormativo, String curso,
			LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cicloFormativo = cicloFormativo;
		this.curso = curso;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getCicloFormativo() {
		return cicloFormativo;
	}

	public String getCurso() {
		return curso;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	
	
	
	

	
}
