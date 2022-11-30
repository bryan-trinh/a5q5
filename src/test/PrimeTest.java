package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import prime.Prime;

class PrimeTest {

	@Test
	public void test2() {
		Prime p = new Prime();
		assertTrue(p.isPrime(2));
	}
	
	@Test
	public void test3() {
		Prime p = new Prime();
		assertTrue(p.isPrime(3));
	}
	
	@Test
	public void test4() {
		Prime p = new Prime();
		assertTrue(p.isPrime(4));
	}
	
	@Test
	public void test5() {
		Prime p = new Prime();
		assertTrue(p.isPrime(5));
	}
	
	@Test
	public void test6() {
		Prime p = new Prime();
		assertTrue(p.isPrime(6));
	}
}
