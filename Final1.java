package Default;

public class Final1 extends FInal2 {
public static void main(String[] args) {
	FInal2 z=new FInal2();
	
	z.display();
	System.out.println(z.x);    //already final method gave value to x=67.,it is constant
	System.out.println(z.name);
}
}
