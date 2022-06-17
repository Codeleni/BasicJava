
package Default;
//example for multilevel inheritance
//unicorn is a subclass of animal class(super)
//pegasus is subclass of unicorn class
public class Main {
public static void main(String[] args) {
	Unicorn uni=new Unicorn();     //object created and call unicorn class
	Pegasus peg=new Pegasus();     //object of pegasus class
	peg.set_value("brown", 8);  
	uni.set_value("white",5);   //passing arguements to animal class method
	uni.get_values();          //getting values
	System.out.println("Age of pegasus is "+peg.getPeg());
}
}
