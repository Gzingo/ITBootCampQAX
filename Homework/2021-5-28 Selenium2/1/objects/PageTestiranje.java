package objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PageTestiranje {
	public static final String URL = "https://itbootcamp.rs/?s=testiranje";
	public static final String READMORE_XPATH = "//*[@id=\"post-9120\"]/figure/figcaption/footer/a";
	
	public static void takeSnapShot(WebDriver driver, String fileWithPath) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\TestiranjeScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
	}
	public static void clickReadMore(WebDriver driver) {
		driver.findElement(By.xpath(READMORE_XPATH)).click();
	}

}
