package ar.edu.utn.frba.sceu.piramide;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args)
	{
		
		int steps = 0;
		int sizeTower = 0;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Tower[] torresHanoi = new Tower[3];
		
		for (int i = 0; i < torresHanoi.length; i++) {
			torresHanoi[i] = new Tower();
		}
///Construccion de la torre origen:

		System.out.println("Ingrese el tamaño de la torre que quiere armar");
		sizeTower = input.nextInt();
		input.nextLine();

		for (int i = sizeTower; i > 0; i--) 
		{
			Disc temp = new Disc(i);
			torresHanoi[0].addDisc(temp);
		}

//		System.out.println("Tamaño torre origen: " + torresHanoi[0].sizeStack());
		

		while(torresHanoi[torresHanoi.length-1].sizeStack() != sizeTower) 
		{
			System.out.println("Seleccione de que torre quiere sacar el disco de la cima.");
			System.out.println("Ingrese 0 para sacar de la inicial. Ingrese 1 para sacar de la intermedia. Ingrese 2 para sacar de la destino");
			int towerInput = input.nextInt();
			
			if(towerInput > torresHanoi.length - 1)
			{	
				System.out.println("Ingreso un valor incorrecto");
				System.out.println("----------------------------------------------------------------");
			}
			else if(torresHanoi[towerInput].sizeStack() > 0) 
			{
				System.out.println("Tiene un disco de tamaño: " + torresHanoi[towerInput].sizeLastDisc() + " a que torre quiere moverlo?");
				
				switch (towerInput) 
				{
				case 0:
					System.out.println("Ingrese 1 para mover a la torre intermedia. Ingrese 2 para mover a la torre destino");
					break;
				case 1:
					System.out.println("Ingrese 0 para mover a la torre inicial. Ingrese 2 para mover a la torre destino");
					break;
				case 2:
					System.out.println("Ingrese 0 para mover a la torre inicial. Ingrese 1 para mover a la torre intermedia");
					break;
				}
				
				int moveInput = input.nextInt();
				
				if(moveInput != towerInput) 
				{
					if(torresHanoi[moveInput].sizeStack() == 0 || torresHanoi[moveInput].sizeLastDisc() > torresHanoi[towerInput].sizeLastDisc()) 
					{
						System.out.println("Movio con exito el disco");
						System.out.println("----------------------------------------------------------------");
						torresHanoi[moveInput].addDisc(torresHanoi[towerInput].pickLast());
					}else {
						System.out.println("El disco en la cima de la torre de movimiento seleccionada es mas chico que el disco a mover");
						System.out.println("----------------------------------------------------------------");
					}
				}
				else 
				{
					System.out.println("Ingreso un valor incorrecto");
					System.out.println("----------------------------------------------------------------");
				}

			}
			else 
			{
				System.out.println("La torre que ingreso no tiene discos");
				System.out.println("----------------------------------------------------------------");
			}
			
			steps++;
			
		}
		
		System.out.println("Felicidade por completar el juego. Le tomo un total de: " + steps + " movimientos");
	}

}
