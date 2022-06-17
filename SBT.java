package Default;

public class SBT extends SIB {   //subclass
	
		void display()      //overriding methods from superclass methods
		{
		System.out.println("This is SBT Bank");	
		}
	  void rateOfInterest(int a)
	   {
		 System.out.println("Rate of interest is "+a);
		 super.display();                     //caaling overidden methods
		 super.rateOfInterest(15);
		 
	   }
	
}
