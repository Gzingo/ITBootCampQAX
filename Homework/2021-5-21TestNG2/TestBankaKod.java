package bankaDom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestBankaKod {

	@Test
	public void testKonstruktor() {
		BankaKod b = new BankaKod("Gordan", "123456-789");

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(b.dohvatiIme(), "Gordan");
		sa.assertEquals(b.dohvatiZiroRacun(), "123456-789");
		sa.assertEquals(b.dohvatiIznos(), 0d);

		sa.assertAll();
	}
	
	@Test
	public void testGetters() {
		BankaKod b = new BankaKod("Gordan", "123456-789");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(b.dohvatiIme(), b.dohvatiIme());
		sa.assertEquals(b.dohvatiZiroRacun(), b.dohvatiZiroRacun());
		sa.assertEquals(b.dohvatiIznos(), b.dohvatiIznos());
		sa.assertEquals(b.dohvatiIznos(), 0d);
		
		sa.assertAll();
	}

}
