package simple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SimpleDummyTest {

	@Test
	public void dummy1() {
		Assert.assertTrue(true);
	}

	@Test
	public void dummy2() {
		Assert.assertFalse(false);
	}

	@Test
	public void dummy3() {
		Assert.assertNotNull("");
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
