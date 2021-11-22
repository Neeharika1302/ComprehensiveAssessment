package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;

public class Script3 {
    @Test
	public static void TC3() {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");
	    FirefoxOptions customProfile = new FirefoxOptions();
	    customProfile.setProfile(new FirefoxProfile());

	    customProfile.addPreference("dom.webnotifications.enabled", false);
	    WebDriver driver = new FirefoxDriver(customProfile);
        driver.get("https://www.eazydiner.com/");
        driver.findElement(By.id("help")).click();
        System.out.println("Title of about us page '"+driver.getTitle()+"'");
        System.out.println("CONTACT DETAILS");
        System.out.println(driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div")).getText());
        driver.close();
	}

}
