package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Home;
import objects.PageTestiranje;

public class TestITBC {
	
	private static WebDriver driver;
	public static final String KWORD_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input";
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void testSearchBtn() {
		driver.navigate().to(Home.URL);
		driver.manage().window().maximize();
		Home.clickSearchBtn(driver);
		Home.inputKword(driver, "testiranje");
		driver.findElement(By.xpath(KWORD_XPATH)).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PageTestiranje.takeSnapShot(driver, "C:\\projectScreenshots\\TestiranjeScreenshot.png");
		PageTestiranje.clickReadMore(driver);
		String url = driver.getCurrentUrl();
		driver.navigate().back();		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(Home.URL);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Home.URL;
		SoftAssert as = new SoftAssert();
		as.assertEquals(currentUrl, expectedUrl);
		as.assertEquals(url, "https://itbootcamp.rs/2021/05/13/testiranje-softvera-kao-izbor-karijere/");
		as.assertAll();
		driver.manage().window().setPosition(new Point(0, 0));
		
		driver.close();
		driver.quit();
	}

}
