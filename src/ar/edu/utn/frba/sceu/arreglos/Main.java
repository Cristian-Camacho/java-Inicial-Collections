package ar.edu.utn.frba.sceu.arreglos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	/*	int[] numeros = new int[20];
		
		for (int i = 0; i < numeros.length; i++) 
		{
			numeros[i] = 2*i;
			System.out.println(numeros[i]);
		}*/

		List<Alumno> curso = new ArrayList<Alumno>();
		

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cuantos alumnos decea ingresar al curso?");
		int cantidadAlumnosCurso = input.nextInt();

	}

}
