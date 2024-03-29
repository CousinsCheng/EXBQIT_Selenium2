import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.*;

import org.junit.*;


public class SeleniumTest {
	
	private WebDriver driver;

	
	
    @Before
    public void setup() throws MalformedURLException
    {
		ChromeOptions options = new ChromeOptions();

		this.driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
		this.driver.manage().window().maximize();
    }


    @Test
    public void loginTest()
    {
        MainPage mainpage = new MainPage(this.driver);
        assertTrue(mainpage.getTitle().contains("King & Country - Finest Toy Soldiers, Historical Miniatures, Military Figurines Producer"));

        LoginPage res = mainpage.openLoginPage();
        assertTrue(res.getTitle().contains("Please Sign In | King & Country"));
        //System.out.println(res.getBodyText());


        AccountPage res2 =  res.login();
        assertTrue(res2.getBodyText().contains("My Account Information"));
        //System.out.println(res2.headerpage());
        //System.out.println(res2.getBodyText());

        LogoffPage res3 = res2.logout();
        System.out.println(res3.headerpage());
        assertTrue(res3.headerpage().contains("You have been logged off your account. It is now safe to leave the computer."));
        
        

    }


    @After
    public void close() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}