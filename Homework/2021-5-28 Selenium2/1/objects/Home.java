package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	public static final String URL = "https://itbootcamp.rs/";
	public static final String SEARCH_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/div[2]/a";
	public static final String KWORD_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input";
	
	public static void clickSearchBtn(WebDriver driver) {
		driver.findElement(By.xpath(SEARCH_XPATH)).click();				
	}
	public static void inputKword(WebDriver driver, String kword) {
		//kword = "testiranje";
		driver.findElement(By.xpath(KWORD_XPATH)).sendKeys(kword);
	}
	/*public static void initSearch(WebDriver driver) {
		driver.findElement(By.xpath(KWORD_XPATH)).sendKeys(Keys.ENTER);
	}*/
}
