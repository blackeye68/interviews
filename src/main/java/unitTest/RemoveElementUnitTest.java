package unitTest;
//Example:
//Given nums = [3,2,2,3], val = 3,
//Your function should return length = 2, with the first two elements of nums being 2.
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveElementUnitTest {
	RemoveElement re = new RemoveElement();
	@Test
	void testRemoveElement() {
		int[] num = new int[] {2,2,3,3};
		int val = 3;
		
		int res = re.removeElement(num, val);
		int expected = 2;  // 2
		assertEquals(expected, res);
	}

}
