
import java.util.Scanner;

public class WeatherReport
{

	public static void main(String[] args) 
	{
	Scanner cin = new Scanner(System.in);
		
	System.out.println("Welcome. Please enter the current temperature in Fahrenheit");
	
		double f = cin.nextInt();
		double ans = 1;
	
	{
		ans = ans * 5/9 * (f-32);
		
		System.out.println("The current temperature is " + ans + " Degrees Celsius");
	}
	
	
	if (f<32)
	{
		System.out.println("I suggest wearing a coat");
		
	}
	else if (f>90)
	{
		System.out.println("Ice pops, anyone?");
		
	}
		  cin.close();
	}

}