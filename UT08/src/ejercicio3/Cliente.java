package ejercicio3;

import java.time.LocalDate;

public class Cliente {

	private int id;
	private String nombre, apellido;
	private LocalDate fechaNacimiento;
	private String email;

	public Cliente(int id, String nombre, String apellido, LocalDate fechaNacimiento, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		
	}
	

	public Cliente( Cliente cliente) {
		this.id = cliente.id;
		this.nombre = cliente.nombre;
		this.apellido = cliente.apellido;
		this.fechaNacimiento = cliente.fechaNacimiento;
		this.email = cliente.email;
	}


	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", email=" + email + "]";
	}

	
}
