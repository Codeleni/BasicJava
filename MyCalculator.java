package Default;
import java.util.Scanner; 
public class MyCalculator extends Calculator {   //subclass
	public static void multiplication(int s,int w)
	{
		System.out.println("MUltiply 2 nos"+(s*w));
	}
public static void main(String[] args) {           //main method
	System.out.println("Enter the 2 values  ");
	Scanner scan=new Scanner(System.in);
	int p=scan.nextInt();
	int q=scan.nextInt();
	
	MyCalculator cal=new MyCalculator();   //object for subclass created
	
	System.out.println("Adding 2 numbers:"+cal.adding(p, q));
	System.out.println("SUbtracting 2 numbers:"+cal.subtracting(p, q));
cal.multiplication(p, q);
	

	
}
}
