package domaciSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lokatori {
	
	private static final String URL = "http://demo.guru99.com/test/newtours/";
	private static final String VACATIONS_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a";
	private static final String BACKTOHOME_FULLXPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img";
	private static final String DESTINATION_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a";
	private static final String HOME_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a";
	private static final String CRUISES_CSSSELECTOR = "body > div:nth-child(5) > table > tbody > tr > td:nth-child(1) > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > a";
	private static final String HOTELS_CSSSELECTOR = "body > div:nth-child(5) > table > tbody > tr > td:nth-child(1) > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr:nth-child(3) > td:nth-child(2) > a";
	private static final String CARRENTALS_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a";
	private static final String FLIGHTS_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
	private static final String FLIGHTTYPE_CSSSELECTOR = "body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > input[type=radio]:nth-child(2)";
	private static final String NUMBEROFPASSENGERS_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[2]";
	private static final String BLANK_CSSSELECTOR = "body > div:nth-child(5)";
	

	public static void main(String[] args) {
		/*
		 * Testiranje sajta http://demo.guru99.com/test/newtours/
		 * Koristiti razlicite moguce lokatore za pronalazenje elemenata - isprobati vise nacina; Zapamtiti lokacije u konstantama
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get(URL);
		WebElement vacations = driver.findElement(By.xpath(VACATIONS_XPATH));
		vacations.click();
		WebElement backToHome = driver.findElement(By.xpath(BACKTOHOME_FULLXPATH));
		backToHome.click();
		WebElement destination = driver.findElement(By.xpath(DESTINATION_XPATH));
		destination.click();
		WebElement home = driver.findElement(By.xpath(HOME_XPATH));
		home.click();
		WebElement cruises = driver.findElement(By.cssSelector(CRUISES_CSSSELECTOR));
		cruises.click();
		WebElement cars = driver.findElement(By.xpath(CARRENTALS_XPATH));
		cars.click();
		WebElement hotels = driver.findElement(By.cssSelector(HOTELS_CSSSELECTOR));
		hotels.click();
		WebElement flights = driver.findElement(By.xpath(FLIGHTS_XPATH));
		flights.click();
		WebElement flightType = driver.findElement(By.cssSelector(FLIGHTTYPE_CSSSELECTOR));
		flightType.click();
		WebElement passengers = driver.findElement(By.name("passCount"));
		passengers.click();
		WebElement passengersNumber = driver.findElement(By.xpath(NUMBEROFPASSENGERS_XPATH));
		passengersNumber.click();
		WebElement blankSpace = driver.findElement(By.cssSelector(BLANK_CSSSELECTOR));
		blankSpace.click();
		
		driver.close();
		driver.quit();

	}

}
