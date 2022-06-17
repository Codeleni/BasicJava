package Default;
// Example for polymorphism
public class Polymorphism {
public static void main(String[] args) {
	Bank sbi=new SBI();         //Bank reference=sbi ,pointing to object of subclass SBI
	Bank icici=new ICICI();
	Bank axis=new AXIS();
	
	System.out.println("INTEREST OF SBI BANK ="+sbi.getInterestRate());
	System.out.println("INTEREST OF ICICI BANK ="+icici.getInterestRate());
	System.out.println("INTEREST OF AXIS BANK ="+axis.getInterestRate());
	
}
}
