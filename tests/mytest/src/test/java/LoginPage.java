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


class LoginPage extends PageBase {
    /* login field locators  */
    private By loginIDLocator = By.xpath("  //*[@id='username'] ");
    private By passwordLocator = By.xpath(" //*[@id='password'] ");
    
    /* submit locator */
    private By loginLocator = By.xpath(" //*[@id='form-login']/p[2]/button ");
    

    public LoginPage(WebDriver driver) {
        super(driver);
        
    }

    
     public AccountPage login()
     {
                
         this.waitAndReturnElement(loginIDLocator).sendKeys("P-27856");

         this.waitAndReturnElement(passwordLocator).sendKeys("Cym990121.");

         this.waitAndReturnElement(loginLocator).click();
        
         return new AccountPage(this.driver);

    }

    public String getTitle()
    {
        return this.driver.getTitle();
    }
}