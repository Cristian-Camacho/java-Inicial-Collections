package ar.edu.utn.frba.sceu.arreglos;

public class Alumno 
{
	private String nombre, apellido;
	private float nota1, nota2;
	
	public Alumno(String nombre, String apellido) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	
	public float Promedio() 
	{
		return (nota1 + nota2)/2;
		
	}

}
/*
Crear un nuevo paquete con el nombre arreglos
Armar una clase que se llame Alumno con los siguientes atributos:
String nombre
String apellido
float nota1
float nota2
crear sus getters and setters
crear un constructor que inicialice el nombre y apellido del alumno
*/