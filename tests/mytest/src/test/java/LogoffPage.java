import org.junit.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


class LogoffPage extends PageBase {

    
    
    /* logoff field locators  */
    private By logoffInformationLocator = By.xpath(" //*[@id='content']/div/div/div/div/div[2]/p[1]"); 
    // continue locators
    private By ctnLocator = By.xpath(" //*[@id='content']/div/div/div/div/div[2]/p[2]/a ");

    public LogoffPage(WebDriver driver) {
        super(driver);
    }

    
     public String headerpage()
    {
         return this.waitAndReturnElement(logoffInformationLocator).getText();
    }

    public String getTitle()
    {
        return this.driver.getTitle();
    }
    

}