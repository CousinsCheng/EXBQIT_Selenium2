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


class AccountPage extends PageBase {

    //logoff button locator
    private By logoffLocator = By.xpath(" //*[@id='nav']/ul/li[4]/a ");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    
    public LogoffPage logout()
     {
         this.waitAndReturnElement(logoffLocator).click();
        
         return new LogoffPage(this.driver);
    }
    

}