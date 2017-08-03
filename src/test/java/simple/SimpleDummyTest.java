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

	@Test
	public void dummy4() {

		Assert.assertNull(null);
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
