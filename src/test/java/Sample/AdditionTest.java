package Sample;

import org.testng.annotations.Test;

public class AdditionTest 
{
	@Test
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}

}
