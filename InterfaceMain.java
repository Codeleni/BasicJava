package Default;

public class InterfaceMain {
public static void main(String[] args) {
	BankChecking obj=new InterfaceSubclass();
	System.out.println("Adding:"+obj.addition());
	obj.getInterest();
}
}
