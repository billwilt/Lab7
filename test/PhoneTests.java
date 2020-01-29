import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PhoneTests {
	
	@Test
	public void testContainsNonNumbers() {
		
		String phone = "734-abc-1234";
		
		Assertions.assertFalse(Lab7Regex.validatePhone(phone));
		
	}
	
	@Test
	public void testContainsHyphen() {
		
		String phone = "313-555-1234";
		
		Assertions.assertTrue(Lab7Regex.validatePhone(phone));
		
	}
	
	@Test
	public void testAreaCode() {
		
		String phone = "1810-555-1234";
		
		Assertions.assertFalse(Lab7Regex.validatePhone(phone));
		
	}
	
	@Test
	public void testPrefixThreeDigits() {
		
		String phone = "877-22-74669";
		
		Assertions.assertFalse(Lab7Regex.validatePhone(phone));
		
	}
	
	@Test
	public void testLineNumber() {
		
		String phone = "248-123-76761";
		
		Assertions.assertFalse(Lab7Regex.validatePhone(phone));
		
	}
	
	@Test
	public void testTenDigits() {
		
		String phone = "1231231234";
		
		Assertions.assertFalse(Lab7Regex.validatePhone(phone));
		
	}

}
