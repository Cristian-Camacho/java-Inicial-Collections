package ar.edu.utn.frba.sceu.arreglos;

import java.util.*;

public class MainCurso {

	public static void main(String[] args) 
	{

		String nombre, apellido;
		float nota1, nota2;
		Alumno[] alumnos = new Alumno[3];
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		
		for (int i = 0; i < alumnos.length; i++) 
		{
			System.out.println("Ingrese nombre del alumno: ");
			nombre = in.nextLine();
			
			System.out.println("Ingrese apellido del alumno: ");
			apellido = in.nextLine();
			
			alumnos[i] = new Alumno(nombre, apellido);
			
			System.out.println("Ingresar primer nota:");
			nota1 = in.nextFloat();
			alumnos[i].setNota1(nota1);
			
			System.out.println("Ingresar segunda nota:");
			nota2 = in.nextFloat();
			alumnos[i].setNota2(nota2);
			
			in.nextLine();
			

		}
		
		for (int i = 0; i < alumnos.length; i++) 
		{
			System.out.println("Nombre: " + alumnos[i].getNombre() + " apellido: " + alumnos[i].getApellido() + " promedio: " + alumnos[i].Promedio());
			
		}
		
		Alumno mejorProm = null;
		
		for (int i = 0; i < alumnos.length; i++) 
		{
			if(mejorProm == null)
				mejorProm = alumnos[i];
			else if (alumnos[i].Promedio() > mejorProm .Promedio()) 
			{
				mejorProm = alumnos[i];
			}
		}
		
		
		System.out.println("El mejor promedio le pertenece a: " + mejorProm.getNombre() + " " + mejorProm.getApellido() + " con un promedio de: " + mejorProm.Promedio());
		 
		
		
		/*
		String[] array = new String[4];
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("Ingrese algo:");
			array[i] = in.nextLine();		
		}
		
		String showData = "";
		
		for (String str : array) {
			showData += str + " "; 
		}
		
		System.out.println(showData);
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		*/
		
		/*
		System.out.println("Ingrese algo:");
		String ingresoUsuario = in.nextLine().toUpperCase();		
		
		System.out.println("Ingreso: " + ingresoUsuario);*/
	}
	
}
