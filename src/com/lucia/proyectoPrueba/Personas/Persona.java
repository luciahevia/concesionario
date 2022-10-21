package com.lucia.proyectoPrueba.Personas;

import java.util.Date;

public class Persona {

	private String nombre;
	private Date fechanacimiento;
	private String lugarnacimiento;
	/**/
/**/
	public Persona(String nombre, Date fechanacimiento, String lugarnacimiento) {
		super();
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
		this.lugarnacimiento = lugarnacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getLugarnacimiento() {
		return lugarnacimiento;
	}

	public void setLugarnacimiento(String lugarnacimiento) {
		this.lugarnacimiento = lugarnacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechanacimiento=" + fechanacimiento + ", lugarnacimiento="
				+ lugarnacimiento + "]";
	}
	

}
