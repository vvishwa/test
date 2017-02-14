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
}
