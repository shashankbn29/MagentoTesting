

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	By email=By.id("email");
By pass=By.id("pass");
By login=By.id("send2");
WebDriver driver;	

public Login(WebDriver driver)
{
this.driver=driver;
}
public void TypeEmail(String em) {
driver.findElement(email).sendKeys(em);
}


public void TypePassword(String pw) {
	driver.findElement(pass).sendKeys(pw);
}

public void ClickOnLogin() {
	driver.findElement(login).click();
}
}