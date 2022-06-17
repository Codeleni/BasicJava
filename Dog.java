package Default;

public class Dog extends Animal1 {   //inheriting animal1 class
public void animalSound()    //overriding method
{
	System.out.println("The dog makes bow bow");
	super.animalSound();
}
}
