package ar.edu.utn.frba.sceu.collections;

import java.util.*;
import ar.edu.utn.frba.sceu.arreglos.*;
import sun.net.www.content.audio.x_aiff;


public class Main {

	public static void main(String[] args)
	{
		/*
		Integer unEntero = 1231;
		Integer otro = new Integer(426);
		Integer unTercero = Integer.valueOf("653");
		
		//Se debe usar list en lugar de array list
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(unEntero);
		lista.add(unTercero);
		
		System.out.println(lista.get(1));
		
		for (Integer entero : lista) 
		{
			System.out.println(entero);
		}
		
		//Usar set en vez de Hashset
		Set<Integer> listaUnica = new HashSet<Integer>();
		
		listaUnica.add(123);
		listaUnica.add(new Integer(123));
		listaUnica.add(321);
		listaUnica.add(123123);
		
		*/
		
		Queue<Integer> que2 = new LinkedList<Integer>();
		Queue<Integer> queu = new PriorityQueue<Integer>();
		Stack<Integer> stac = new Stack<Integer>();
		Set<Integer> listaUnica = new HashSet<Integer>();
		List<Integer> listaInt = new ArrayList<Integer>();
		
		

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		Boolean cond = true;
		while (cond) 
		{
			System.out.println("Ingrese un numero");
			Integer entero = in.nextInt();
			
			que2.add(entero);
			queu.add(entero);
			
			cond = listaUnica.add(entero);
			if(cond)
				System.out.println("El numero: " + entero + " se agrego correctamente");
		}
		System.out.println("El numero ingresado ya existia");
		
		
		System.out.println("Linked list: ");
		while(que2.size()> 0) {
			System.out.println(que2.poll());
			
		}
		
		System.out.println("Priority list: ");
		while(queu.size()> 0) {
			System.out.println(queu.poll());
			
		}	
	}
}
