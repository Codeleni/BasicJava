package Default;

public class BankAbstract {
public static void main(String[] args) {
	
	Bank1 ab=new SBI1();   //refernce variable of abstarct class point to sbi class
	Bank1 cd=new AXIS1();
	
	System.out.println("Interest rate of sbi:"+ab.rateOfInterest(5));
	System.out.println("Interest rate of axis:"+cd.rateOfInterest(6));
	}
}

