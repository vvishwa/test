package core.java.chap1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicTest {

	@Test
	public void testAddWithoutPlusOperator(){
	assertEquals(5, halfAdder(3, 2));
	assertEquals(5, dirtyAdd(3, 2));
	System.out.println(negate(10));
	}

	
	int halfAdder(int a,int b)
	{
	    int sum,carry;  
	    if (b == 0) 
	            return a;
	    sum = a ^ b; // add without carrying
	    carry = (a & b) << 1; // carry, but don’t add
	    return halfAdder(sum,carry); // recurse
	}
	
	int dirtyAdd(int a, int b) {
		while (b > 0) {
			a++;
			b--;
		}
		return a;
	}
	
	static int negate(int x) {
		return (~x) + 1;
	}

	/*
	 * Find number smallest number K , if exists, such that product of its digits is N. Eg: N = 6,
		smallest number is k=16(1*6=6) and not k=23(2*3=6).
	 */
	int smallestDigit(int n) {
		if (n == 0 || n == 1)
			return n;
		int i = 9;
		int num = 0;
		int pow = 1;
		while (i > 0) {
			while (n % i == 0 && i > 1) {
				num = i * pow + num;
				pow = pow * 10;
				n = n / i;
			}
			i--;
		}
		if (n != 1)
			return -1;
		else
			return num;
	}
}
