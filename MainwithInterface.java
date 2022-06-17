package Default;  //Multiple interfaces

public class MainwithInterface implements FirstInterface,SecondInterface{
	
	public String dogSounds()    //Implementing methods in 2 interfaces
	{
		return "bow,bow";
	}
    public	void catSounds()
	{
		System.out.println("cat says meow meow");
	}
    public String horseSays()
    {
    	return ("Horse says neigh,neigh");
    }
	public void cowSays()
	{
		System.out.println("Cow always sounds moo moo");
	}
	
public static void main(String[] args) {
	MainwithInterface obj=new MainwithInterface();    //creating objectt of implemented class
	obj.catSounds();
	System.out.println("Dog says hi "+obj.dogSounds());
	System.out.println(obj.horseSays()) ;
	obj.cowSays();
}
}
