package com.vaishnavi;


class sports{
	
	public void play()
	{
		System.out.println("playing sports");	
	}
}
class Football extends sports
{
	@Override
	public void play()
	{
		System.out.println("playing Football");
	}
}
class Basketball extends sports
{
	@Override
	public void play()
	{
		System.out.println("playing basketball");
	}
}
class Cricket extends sports{
	@Override
	public void play()
	{
		System.out.println("playing Cricket");
	}
}

public class SportsMain {
	public static void main(String[] args)
	{
	      sports f=new Football();
	      sports b=new Basketball();
	      sports r=new Cricket();
	      f.play();
	      b.play();
	      r.play();
	}
}
