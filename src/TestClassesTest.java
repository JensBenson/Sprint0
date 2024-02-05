import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassesTest {

	@Test
	public void testAdd() {
		TestClasses addi = new TestClasses();
		int result = addi.add(10, 5);
		assertEquals(15, result);
		
	}
	
	@Test
	public void testSquare() {
		TestClasses squ = new TestClasses();
		int result = squ.square(5);
		assertEquals(25, result);
	}

}
