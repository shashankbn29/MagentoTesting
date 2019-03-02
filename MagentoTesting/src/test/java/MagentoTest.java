

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	@Test	
	public void positive1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
        Welcome w=new Welcome(driver);
		w.ClickOnMyAcct();
		Login	l=new Login(driver);
		l.TypeEmail("nithya.27.v@gmail.com");
		l.TypePassword("Welcome123");
		l.ClickOnLogin(); 
       Main m=new Main(driver);
		m.ClickOnLogout();
		driver.quit();
	}
}
