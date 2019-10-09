package ar.edu.utn.frba.sceu.forma;

public class Main {

	public static void main(String[] args) 
	{
		FormaRectangular forma1 = new FormaRectangular();
		forma1.set_base(10);
		forma1.set_altura(12);
		
		FormaRectangular forma2 = new FormaRectangular();
		forma2.set_altura(30);
		forma2.set_base(2);
		
		
		System.out.println(String.format("El area del rectangulo es %d, su perimetro es de %d", forma1.getArea(), forma1.getPerimetro()));
		
		if(forma1.cuadrado())
			System.out.println("El objeto es cuadrado");
		else
			System.out.println("El objeto no es cuadrado");

		
		if(forma1.getArea() > forma2.getArea())
			System.out.println("El primer objeto es mas grande que el segundo objeto");
		else if(forma1.getArea() < forma2.getArea())
			System.out.println("El segundo objeto es mas grande que el primer objeto");
		else 
			System.out.println("Ambos objetos tienen el mismo tamaño");


		
	}

}
