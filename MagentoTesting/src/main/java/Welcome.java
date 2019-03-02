

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;



public class Welcome {
	WebDriver driver;
	By myacct=By.linkText("My Account");




	public Welcome(WebDriver  driver)
	{
		this.driver=driver;
	}

	public void ClickOnMyAcct()
	{
		driver.findElement(myacct).click();

	}
}
