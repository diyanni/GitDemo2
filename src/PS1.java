import org.testng.annotations.Test;

public class PS1 extends PS {


	@Test
	public void testRun()
	{
		PS2 ps2= new PS2(3);//creating object of the class PS2 //Parameterized Constructor-
		////Basically in the back end constructors are called by default but when you when 
		//you are creating class objects with parameter in place then we have to 
		//explicitly call that Constructor
		
		int a=3;
	  doThis();//parent class
	  System.out.println(ps2.increment());
	  System.out.println(ps2.decrement());
	  System.out.println(ps2.multiplyTwo());
	  System.out.println(ps2.multiplyThree());
	  System.out.println("hello");
	  System.out.println("hello world");
	  System.out.println("welcome");
	}
@Test
public void rainyDay() 
{
	System.out.println("It is rainy day");
}
}
//here we not done it explicitly of initializing an object and calling the constructor but
//we have used the keyword Super to invoke the parent constructor in PS3 into PS2
//Super keyword is used when there is inheritance in place
//when you are using Super keyword it should be the first line in your child constructor