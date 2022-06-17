package Default;
import java.util.Scanner;
public class InterfaceSubclass implements BankChecking {
	Scanner scan=new Scanner(System.in);
	
	public int addition()
	{
		System.out.println("Enter the values to add");
		int a=scan.nextInt();
		int b=scan.nextInt();
		return (a+b);
	}
	
	public void getInterest()
	{
		System.out.println("Enter the interest rate of bank");
		float x=scan.nextFloat();
	System.out.println("Interest of bank is:"+x);		
	}

}
