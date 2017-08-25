package numbergen;

import java.util.Scanner;

public class NumberGenerator 

{
	
	public static void main(String[] args)
	
{
	//sets up the scanner	
	Scanner cin = new Scanner(System.in);

	System.out.println("Hello. My name is Victor.");

	System.out.println("I'm thinking of a number. Can you guess it?");
	
	//generates a random number
	int a = 1;
	int b = 100;
	int n = (int)(a+b*Math.random());
	int i = cin.nextInt();
	boolean ans = true;
	
	if (i==n)
	{
	
		ans = true;
	 
		System.out.println("Well done, user. You have passed the test");
	}
	
	if (i>n)
	{
		
		ans  = false;
		
		//sets up witty comments
		int y = 1;
		int z = 5;
		int j = (int)(y+z*Math.random());
	
		if (j==1)
		{
			System.out.println("Ha! you cannot defeat the mighty Victor");
		}
	
		if (j==2)
		{
			System.out.println("You jumped the shark with a number that high");
		}
	
		if (j==3)
		{
			System.out.println("Your answer is soo high, Sputnik is telling you to lower it");
		}
	
		if (j==4)
		{
			System.out.println("You're high, dude. You should get some help");
		}
	
		if (j==5)
		{
			System.out.println("You're up in the clouds with that number.");
		}
	
	}
	
	if (i<n)
	{
		
		ans = false;
		
		//sets up witty comments
		int u = 1;
		int v = 5;
		int r = (int)(u+v*Math.random());
	
		if (r==1)
		{
			System.out.println("Ha! you cannot defeat the mighty Victor");
		}
	
		if (r==2)
		{
			System.out.println("Hello, Hobbit.");
		}
	
		if (r==3)
		{
			System.out.println("You're so low with that number, submarines are telling you to pull up.");
		}
	
		if (r==4)
		{
			System.out.println("Low guess? I expected better, user.");
		}
	
	if (r==5)
	{
		System.out.println("Undershot, you failure.");
	}
	

	
	}
	
	//allows the user to answer again if they get it wrong
	while (ans == false)
	{ 
		i = cin.nextInt();
		
		if (i==n)
		{
		
			ans = true;
		 
			System.out.println("Well done, user. You have passed the test");
		}
		
		if (i>n)
		{
			
			ans = false;
			
			//sets up witty comments
			int y = 1;
			int z = 5;
			int j = (int)(y+z*Math.random());
		
			if (j==1)
			{
				System.out.println("Ha! you cannot defeat the mighty Victor");
			}
		
			if (j==2)
			{
				System.out.println("You jumped the shark with a number that high");
			}
		
			if (j==3)
			{
				System.out.println("Your answer is soo high, Sputnik is telling you to lower it");
			}
		
			if (j==4)
			{
				System.out.println("You're high, dude. You should get some help");
			}
		
			if (j==5)
			{
				System.out.println("You're up in the clouds with that number.");
			}
		
		}
		
		if (i<n)
		{
			
			ans = false;
			
			//sets up witty comments
			int u = 1;
			int v = 5;
			int r = (int)(u+v*Math.random());
		
			if (r==1)
			{
				System.out.println("Ha! you cannot defeat the mighty Victor");
			}
		
			if (r==2)
			{
				System.out.println("Hello, Hobbit.");
			}
		
			if (r==3)
			{
				System.out.println("You're so low with that number, submarines are telling you to pull up.");
			}
		
			if (r==4)
			{
				System.out.println("Low guess? I expected better, user.");
			}
		
		if (r==5)
		{
			System.out.println("Undershot, you failure.");
		}
	}	
	
	}
		cin.close();
	}
}
	