import org.testng.annotations.Test;

public class PS2 extends PS3 {
int a; //this is called class variable-global class variable


public PS2(int a) {//int a is called as instance variable
	// TODO Auto-generated constructor stub
//Assigning this a to global variable a
	super(a);//parent class constructor is invoked
	this.a=a;

//whatever you receive in the test you send to parent class to activate
}//this is an Constructor// the scope of a is here only



	
	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decrement()
	{
		a=a-1;
		return a;
	}
	@Test
	public void windyDay()
	{
		System.out.println("It is a windy day");
	}
}
