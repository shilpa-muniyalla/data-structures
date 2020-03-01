package test;

import com.shil.EvenOdd;

import org.junit.Assert;
import org.junit.Test;

public class EvenOddTest {
	EvenOdd evenOdd = new EvenOdd();
	
	@Test
	public void testEven() {
		String s=EvenOdd.findEvenOdd(2);
	Assert.assertEquals("EVEN",s);
			
	}
	
	@Test
	public void testOdd() {
		String s=evenOdd.findEvenOdd(3);
		Assert.assertEquals("Expected Odd", "ODD", s);
		
	}

}
