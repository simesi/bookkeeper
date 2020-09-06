package org.apache.bookkeeper;
import org.apache.bookkeeper.common.util.MathUtils;
import org.junit.Test;
import org.junit.Assert;

public class MathUtilsTest {

	 // int signSafeMod(long dividend, int divisor)
	
	@Test (expected = java.lang.ArithmeticException.class)
	public void signSafeModTest() {           //invalid input
		Assert.assertTrue(MathUtils.signSafeMod(0, 0)==0);
		
	}
	@Test 
	public void signSafeModTest2() {           //valid input
		Assert.assertTrue(MathUtils.signSafeMod(3, 2)==1);
		
	}
	
	@Test  //to increase coverage
	public void signSafeModTest3() {        
		Assert.assertTrue(MathUtils.signSafeMod(3, -2)==1);
		
	}
	
	//int findNextPositivePowerOfTwo(final int value)-----------
	
	@Test
	public void findNextPositivePowerOfTwoTest() {          //valid input
		     Assert.assertTrue(MathUtils.findNextPositivePowerOfTwo(9)==16);
	}
	@Test
	public void findNextPositivePowerOfTwoTest1() {          
		     Assert.assertTrue(MathUtils.findNextPositivePowerOfTwo(0)==1);
	}
	@Test
	public void findNextPositivePowerOfTwoTest2() {          
		     Assert.assertTrue(MathUtils.findNextPositivePowerOfTwo(-1)==1);
	}
	
	
}
