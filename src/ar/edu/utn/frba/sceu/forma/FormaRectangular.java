package ar.edu.utn.frba.sceu.forma;

public class FormaRectangular 
{
	private int base, altura;

	
	public FormaRectangular() 
	{
		
	}


	public int get_base() {
		return base;
	}

	public void set_base(int _base) {
		this.base = _base;
	}

	public int get_altura() {
		return altura;
	}

	public void set_altura(int _altura) {
		this.altura = _altura;
	}
	
	
	public int getArea() 
	{
		return base * altura;
	}
	
	public int getPerimetro() 
	{
		return 2 * (base + altura);
	}
	
	public Boolean cuadrado() 
	{
		//Simplicacion del if, de esta manera si la base no es igual a la altura devuelve "False"
		return base == altura;
		/*
		if(base == altura)
			return true;
		else
			return false;*/
	}
	
	
}

/* 
 *Crear atributos base y altura de tipo entero, un constructor que permita instanciar la clase
los atributos solo se pueden modificar y acceder a traves de los getters/setters
nuevos mensajes
Crear tres metodos que nos indiquen su area, su perimetr y si son cuadrados (editado) 
 */