package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;

public class CalculatorTest {

	@Tag("Sanity")
	@Test
	public void addTest1() {

		assertEquals(9, Calculator.add(4, 5));

	}
	
	@Disabled
	@Test
	public void subTest1() {

		assertEquals(2, Calculator.sub(4, 2));

	}

}
 	 	