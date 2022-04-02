package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {
	
	@BeforeAll
	public static void method3() {	
		System.out.println("Inside Before All method");
	}
	
	
	@BeforeEach
	public void method1() {
		System.out.println("Before each method");
	}
	
	@Test
	public void test() {
		assertEquals(9, Calculator.add(4, 5));
		assertTrue(true);
		
		String[] array1 = {"one","two","three"};
		String[] array2 = {"one","two","three"};
		
		assertArrayEquals(array1, array2);
		
		System.out.println("Inside test");
	}
	
	@Test
	public void test1() {
		assertEquals(19, Calculator.add(4, 15));
		System.out.println("inside test1");
	}
	
	@AfterEach
	public void method2() {
		System.out.println("After each method");
	}
	
	@AfterAll
	public static void method4() {	
		System.out.println("Inside After All method");
	}

}
