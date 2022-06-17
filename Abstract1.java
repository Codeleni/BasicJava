package Default;

public class Abstract1 {
public static void main(String[] args) {
	exp1 obj=new exp2();                 //creating object for abstarct class pointing to extended class object
	System.out.println("Adding 2 values "+obj.myAddition(12,6));
	obj.myMultiplication();
}
}
