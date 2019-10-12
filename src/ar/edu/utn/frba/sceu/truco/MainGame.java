package ar.edu.utn.frba.sceu.truco;

import java.util.List;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args)
	{
			
		Mazo miDeck = new Mazo();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Boolean cond = true;
		
		while (cond) 
		{
			System.out.println("Ingrese una de las siguientes opciones para interactuar con el mazo:");
			System.out.println("Ingrese 1 para mezclar el mazo. Ingrese 2 para recibir un carta. Ingrese 3 para saber cuantas cartas le quedan al mazo");
			System.out.println("Ingrese 4 para pedir multiples cartas. Ingrese 5 para revisar las cartas descartadas. Ingrese 6 para revisar las cartas restantes del mazo");
	
			int ingreso = input.nextInt();
			
			switch (ingreso) {
			case 1:
				miDeck.Shuffle();
				break;
			case 2:
				Card temp = miDeck.NextCard();
				InfoCarta("Recibiste una carta del mazo", temp.getNumero(), temp.getPalo());
				
			case 3:
				miDeck.CartasDisponibles();			
				break;
				
			case 4:
				System.out.println("Ingrese cuantas cartas quiere recibir");
				int cartasPedidas = input.nextInt();
				List<Card> tempList = miDeck.PedirCartas(cartasPedidas);
				if(tempList.size() > 0) 
				{
					for (Card card : tempList) 
					{
						InfoCarta("Recibiste una carta del mazo", card.getNumero(), card.getPalo());
					}
				}
				break;
			case 5: 
				miDeck.MostrarDescarte();
				break;
			
			case 6: 
				miDeck.MostrarMazoRestante();
				break;
				
			default:
				System.out.println("Ingreso un valor fuera de los esperados se terminara el proceso");
				cond = false;
				break;
			}

		}
	}
	
	public static void InfoCarta(String textoBase, int numero, int palo) 
	{
		switch (palo) {
		case 0:
			System.out.println(textoBase + " espada de numero " + numero);
			break;
		case 1:
			System.out.println(textoBase + " basto de numero: " + numero);
			break;
		case 2:
			System.out.println(textoBase + " oro de numero: " + numero);
			break;
		case 3:
			System.out.println(textoBase + " copa de numero: " + numero);
			break;
		default:
			System.out.println("Error en el palo pasado de la carta");
			break;
		}
	}
}
