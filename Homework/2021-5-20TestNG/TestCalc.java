package domaciTestNG;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCalc {

	/*
	 * @Test public void testInputOutput() {
	 * 
	 * String input = "krug";
	 * 
	 * InputStream in = new ByteArrayInputStream(input.getBytes());
	 * System.setIn(in);
	 * 
	 * SoftAssert sa = new SoftAssert();
	 * 
	 * sa.assertEquals("KRUG", input.toLowerCase()); sa.assertEquals("krug",
	 * input.toUpperCase()); sa.assertEquals("Krug", input.toLowerCase());
	 * sa.assertEquals("Krug", input.toUpperCase());
	 * 
	 * sa.assertAll(); }
	 */
	@Test
	public void testRacunajKrug() {

		String input = "krug";
		InputStream in = new ByteArrayInputStream(input.getBytes());

		double r = 4;
		double exp = r * r * 3.14;
		double act = Calc.pKruga(r);

		System.setIn(in);

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(input, input.toString());
		sa.assertEquals(act, exp);

		sa.assertAll();

	}

	@Test
	public void testRacunajPravougaonik() {

		String input = "pravougaonik";
		InputStream in = new ByteArrayInputStream(input.getBytes());

		double a = 5;
		double b = 6;
		double exp = a * b;
		double act = Calc.pPravougaonika(a, b);

		System.setIn(in);

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(input, input.toString());
		sa.assertEquals(act, exp);

		sa.assertAll();

	}

	@Test
	private void testRacunajKvadrat() {

		String input = "pravougaonik";
		InputStream in = new ByteArrayInputStream(input.getBytes());

		double a = 5;
		double exp = a * a;
		double act = Calc.pKvadrata(a);

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(input, input.toString());
		sa.assertEquals(act, exp);

		sa.assertAll();
	}

}
