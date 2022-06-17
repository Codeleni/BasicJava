package Default;
import java.util.Scanner;
public class exp2 extends exp1 {             //inheriting abstarct class
Scanner scan=new Scanner(System.in);
	 int myAddition(int a,int b)         //implementing abstarct class
	 {
		 return (a+b);
	 }
	 void myMultiplication()
	 {
		 System.out.println("Enter the 2 values:");
		 int c=scan.nextInt();
		 int d=scan.nextInt();
		 int multi=c*d;
		 System.out.println("Mutipluing 2 values:"+multi);
	 }
	 
}

