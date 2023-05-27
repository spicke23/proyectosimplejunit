package testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
public class StringEqualityTest {

	@Test
	public void testStringEquality() {
		String str1 = "Hola";
		String str2 = "Hola";
		
		Assertions.assertEquals(str1, str2);
	}
}
