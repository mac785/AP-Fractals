import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexTest
{

	@Test
	public void testEquals()
	{
		// assertEquals and assertNotEquals versions....
		assertEquals (Complex.one, new Complex(1,0));
		assertNotEquals(Complex.one, new Complex(0,1));
		
		// assertTrue and assertFalse versions....
		assertTrue (Complex.i.equals(new Complex(0,1)));
		assertTrue (new Complex(4,3).equals(new Complex(4,3)));
		assertFalse(Complex.zero.equals(new Complex(0.5, 0.75)));
		assertFalse(new Complex(11,12).equals(new Complex(13, 14)));
		
	}
	@Test
	public void testMagnitude(){
		assertEquals (Complex.one.magnitude(),1,0.01);
		assertNotEquals (Complex.one.magnitude(), 5,0.01);
		
		assertTrue(Complex.one.magnitude()==1);
		assertTrue(new Complex(3,4).magnitude()==5);
		assertFalse(Complex.zero.magnitude()==17);
		assertFalse(new Complex(6,8).magnitude()==100);
	}
	@Test
	public void testCompareTo(){
//		assertEquals(Complex.one.compareTo(new Complex(1,0)),0,0.0001);
//		assertNotEquals(Complex.one.compareTo(new Complex(0,1)),0,0.0001);
		
		assertTrue(Complex.one.compareTo(new Complex(3,4))<0);
		assertTrue(new Complex(10,16).compareTo(new Complex(3,4))>0);
		assertTrue(new Complex(4,4).compareTo(new Complex(4,4))==0);
		assertFalse(Complex.one.compareTo(new Complex(3,4))>0);
		assertFalse(new Complex(10,16).compareTo(new Complex(3,4))<0);
	}
	
//-----------------------------------------------------------Complex Math---------------------------------------------------------------------------
	
	@Test
	public void testPlus(){
		assertTrue(new Complex(2,2).plus(new Complex(2,2)).equals(new Complex(4,4)));
		assertFalse(new Complex(1,1).plus(new Complex(1,1)).equals(new Complex(16,16)));
	}
	@Test
	public void testTimesNormal(){
		assertTrue(new Complex(2,2).times(4).equals(new Complex(8,8)));
		assertFalse(new Complex(3,3).times(5).equals(new Complex(1,1)));
	}
	@Test
	public void testTimesComplex(){
		assertTrue(new Complex(2,2).times(new Complex(3,4)).equals(new Complex(-2,14)));
		assertFalse(new Complex(5,5).times(new Complex(16,16)).equals(new Complex(234234,1231223)));
	}
	@Test 
	public void testSquared(){
		assertTrue(new Complex(4,4).squared().equals(new Complex(0,32)));
		assertFalse(new Complex(4,4).squared().equals(new Complex(5,5)));
	}
	@Test
	public void testMinus(){
		assertTrue(new Complex(4,4).minus(new Complex(2,2)).equals(new Complex(2,2)));
		assertFalse(new Complex(4,4).minus(new Complex(2,2)).equals(new Complex(17,6)));
	}
}
