package ar.edu.utn.frba.sceu.truco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Mazo 
{
	private Card[] deck;
	private int currentIndex;
	private Stack<Card> mazoJuego = new Stack<Card>();
	private List<Card> cartasjugadas= new ArrayList<Card>();
	
	public Mazo() 
	{
		deck = new Card[40];
		currentIndex = 0;
		CreateDeck();
	//	CheckDeck();
		Shuffle();
	}
	
	
	private void CreateDeck() 
	{
		for (int i = 0; i < 4; i++) 
			for (int j = 1; j < 13; j++) 
				if(j != 8 && j != 9) 
				{
					deck[currentIndex] = new Card(j, i);
					currentIndex++;
				}
	}
	
	
	private void CheckDeck() 
	{
		for (Card card : deck) 
		{
			switch (card.getPalo())
			{
			case 0:
				System.out.println("Valor de la carta: " + card.getNumero() + " y pertenece al palo de espadas");
				break;

			case 1:
				System.out.println("Valor de la carta: " + card.getNumero() + " y pertenece al palo de basto");
				break;
				
			case 2: 
				System.out.println("Valor de la carta: " + card.getNumero() + " y pertenece al palo de oro");
				break;
			case 3: 
				System.out.println("Valor de la carta: " + card.getNumero() + " y pertenece al palo de copas");
				break;
			default:
				System.out.println("Error en la creacion del mazo");
				break;

			}
		}
	}

	public void Shuffle() 
	{
		List<Integer> valoresAgregados = new ArrayList<Integer>();
		List<Card> tempList = new ArrayList<Card>();
		Random ran = new Random();
		mazoJuego.clear();
		
		while (tempList.size() < 40) 
		{
			int data = ran.nextInt(40);
			if(!valoresAgregados.contains(data)) 
			{
				tempList.add(deck[data]);
				valoresAgregados.add(data);		
			}
		}
		
		for (int i = 0; i < tempList.size(); i++) 
		{
			deck[i] = tempList.get(i);
			mazoJuego.add(tempList.get(i));
		}		
	}
	
	public void ShuffleV2() 
	{
		Random ran = new Random();
		
		for (int i = 0; i < 40; i++) 
		{
			int data = ran.nextInt(40);
			Card aux = deck[i];
			deck[i] = deck[data];
			deck[data] = aux;
		}
	}
	
	public Card NextCard() 
	{
		if(mazoJuego.size() > 0)
		{
			Card temp = mazoJuego.pop();
			if(mazoJuego.size() == 0)
				System.out.println("Esta es la ultima carta del mazo");
			
			cartasjugadas.add(temp);
			return temp;
		}
		System.out.println("No quedan mas cartas en el mazo");
		return null;
	}
	
	public int CartasDisponibles() 
	{
		System.out.println("Al mazo de juego le quedan " + mazoJuego.size() + " cartas");
		return mazoJuego.size();
	}
	
	public List<Card> PedirCartas(int cantidad)
	{
		List<Card> tempList = new ArrayList<Card>();
		
		if(cantidad <= mazoJuego.size()) 
			for (int i = 0; i < cantidad; i++) 
				tempList.add(NextCard());
		else 
			System.out.println("El mazo no tiene suficiente cartas para darle la cantidad que pidio");

		return tempList;
	}
	
	public void MostrarDescarte() 
	{
		for (Card card : cartasjugadas) 
		{
			MainGame.InfoCarta("En el descarte eta la carta numero: ", card.getNumero(), card.getPalo());
/*			switch (card.getPalo())
			{
			case 0:
				System.out.println("En el descarte esta la carta numero: " + card.getNumero() + " del palo de espadas");
				break;

			case 1:
				System.out.println("En el descarte esta la carta numero: " + card.getNumero() + " del palo de basto");
				break;
				
			case 2: 
				System.out.println("En el descarte esta la carta numero: " + card.getNumero() + " del palo de oro");
				break;
			case 3: 
				System.out.println("En el descarte esta la carta numero: " + card.getNumero() + " del al palo de copas");
				break;
			default:
				System.out.println("Error en el descarte");
				break;

			}*/
		}
	}
	
	public void MostrarMazoRestante() 
	{
		for (Card card : mazoJuego) 
		{
			MainGame.InfoCarta("En el mazo se encuentra la carta numero: ", card.getNumero(), card.getPalo());
			
			/*
			switch (card.getPalo())
			{
			case 0:
				System.out.println("La carta numero: " + card.getNumero() + " del palo de espadas sigue en el mazo");
				break;

			case 1:
				System.out.println("La carta numero: " + card.getNumero() + " del palo de basto sigue en el mazo");
				break;
				
			case 2: 
				System.out.println("La carta numero: " + card.getNumero() + " del palo de oro sigue en el mazo");
				break;
			case 3: 
				System.out.println("La carta numero: " + card.getNumero() + " del al palo de copas sigue en el mazo");
				break;
			default:
				System.out.println("Error en el mazo restante");
				break;

			}*/
		}
		
	}
}
