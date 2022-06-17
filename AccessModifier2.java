package Default;

public class AccessModifier2 {
public int a;
public String name;  //default variables

AccessModifier2()     //constructor-intitializing
{
	a=10;
	name="AARON";
}
public  void display()
{
	System.out.println("My name is "+name+" and i am "+a+" year old");
}
}
