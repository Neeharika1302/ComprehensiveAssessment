package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;

public class Script2 {
    @Test
	public static void TC2() throws InterruptedException {
		      System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");
		      FirefoxOptions customProfile = new FirefoxOptions();
		      customProfile.setProfile(new FirefoxProfile());

		      customProfile.addPreference("dom.webnotifications.enabled", false);

		     WebDriver driver = new FirefoxDriver(customProfile);

	        driver.get("https://www.eazydiner.com/");
	        //WebElement mouse = driver.findElement(By.xpath("//*[text()='About Us']"));
	        //Actions action = new Actions(driver);
		    //action.moveToElement(mouse).click().build().perform();
		    //Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[text()='About Us']")).click();
		    System.out.println("Title of about us page '"+driver.getTitle()+"'");
		    System.out.println("first FAQ is \n"+driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/h2[2]")).getText());
		    System.out.println(driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/p[20]")).getText());
		    driver.close();

	}

}
