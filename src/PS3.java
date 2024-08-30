import org.testng.annotations.Test;

public class PS3 {
	
	int a;
	public PS3(int a) {
		// TODO Auto-generated constructor stub
		this.a=a;
	}

	public int multiplyTwo()
	{
		
		a=a*2;
		return a;
		
		
	}
	
	public int multiplyThree()
	{
		
		a=a*3;
		return a;
		
		
	}
	@Test
	public void beautifulDay()
	{
		System.out.println("It is a beautiful day");
	}
	
	
	
	

}
