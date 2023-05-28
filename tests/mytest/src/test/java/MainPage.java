import org.junit.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;



class MainPage extends PageBase {

    
     private By loginLocator = By.xpath(" //*[@id='tertiary-links']/ul/li[2]/a ");

    
    
    public MainPage(WebDriver driver ) {
        super(driver);
        this.driver.get("https://www.kingandcountry.com/");
        //Reading the page title
        //System.out.println("The Page Title is: " + driver.getTitle());
    }    
    


    public LoginPage openLoginPage()
    {
        this.waitAndReturnElement(loginLocator).click();
        return new LoginPage(this.driver);

    }

    public String getTitle()
    {
        return this.driver.getTitle();
    }
 

}