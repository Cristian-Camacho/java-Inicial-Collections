package ar.edu.utn.frba.sceu.piramide;

import java.util.Stack;

public class Tower 
{
	private Stack<Disc> torre;

	public Tower()
	{
		torre = new Stack<Disc>();
	}
	
	public void addDisc(Disc disco) 
	{
		torre.add(disco);
	}
	
	public Disc pickLast() 
	{
		if(torre.empty())
			return null;
		else
			return torre.pop();
	}
	
	public int sizeLastDisc() 
	{
		if(torre.empty()) return -1;

		return torre.peek().getSize();
	}
	
	public int sizeStack() 
	{
		return torre.size();
	}

}
