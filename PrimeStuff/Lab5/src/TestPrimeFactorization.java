import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class TestPrimeFactorization {
	@Test
	public void testOne(){
		assertEquals(new ArrayList<Integer>(), PrimeFactorization.generatePrimes(1));
	}
	@Test
	public void testTwo(){
		ArrayList<Integer> stuff = new ArrayList<Integer>();
		stuff.add(2);
		assertEquals(stuff, PrimeFactorization.generatePrimes(2));
	}
	
	@Test
	public void testThree(){
		ArrayList<Integer> stuff = new ArrayList<Integer>();
		stuff.add(3);
		assertEquals(stuff, PrimeFactorization.generatePrimes(3));
		
	}
	
	@Test
	public void testFour(){
		ArrayList<Integer> stuff = new ArrayList<Integer>();
		stuff.add(2);
		stuff.add(2);
		assertEquals(stuff, PrimeFactorization.generatePrimes(4));
	}
	
	@Test
	public void testSix(){
		ArrayList<Integer> stuff = new ArrayList<Integer>();
		stuff.add(2);
		stuff.add(3);
		assertEquals(stuff, PrimeFactorization.generatePrimes(6));
	}
	
	@Test
	public void testEight(){
		ArrayList<Integer> stuff = new ArrayList<Integer>();
		stuff.add(2);
		stuff.add(2);
		stuff.add(2);
		assertEquals(stuff, PrimeFactorization.generatePrimes(8));
	}
	
	@Test
	public void testNine(){
		ArrayList<Integer> stuff = new ArrayList<Integer>();
		stuff.add(3);
		stuff.add(3);
		assertEquals(stuff, PrimeFactorization.generatePrimes(9));
	}
}
