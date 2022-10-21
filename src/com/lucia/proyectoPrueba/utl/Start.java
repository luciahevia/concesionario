package com.lucia.proyectoPrueba.utl;

import java.util.Date;

import com.lucia.proyectoPrueba.Coches.Coche;
import com.lucia.proyectoPrueba.Personas.Persona;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona= new Persona("Mapi",new Date(),"El corte ingles");
		Coche coche= new Coche(persona);
		coche.setPuertas(5);
		
		System.out.println(coche.toString());

	}

}
