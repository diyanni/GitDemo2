import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

public void doThis()
{
		//Inheritance means you can acquire the properties of your parent class. Say you want to access
		//methods, variables etc declared in this class into another class
	System.out.println("I am here");
	System.out.println("I am here2");
	System.out.println("I am here3");
	System.out.println("I am here4");
	System.out.println("I am here5");
	System.out.println("I am here6");
	}
@BeforeMethod
public void beforeRun()
{
	System.out.println("run me first");
	System.out.println("run me first");
}

@AfterMethod
public void afterRun()
{
	System.out.println("run me last"); 
}

}
