 package Default;

public class AXIS extends Bank { //subclass of Bank
	 	AXIS()     //constructor
	 	{
	 		System.out.println("Main bank intrest:"+super.getInterestRate()); //calling superclass original interest	
	 	}
	public double getInterestRate()
	{
		
		return 7.8;
	}

}
