import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage{


    public WebElement userName(WebDriver driver) {
        return driver.findElement(By.id("usern"));
    }

    public WebElement password(WebDriver driver) {
        return driver.findElement(By.id("pass"));
    }

    public WebElement code(WebDriver driver) {
        return driver.findElement(By.id("acc"));
    }

    public WebElement clickLogin(WebDriver driver){
        return driver.findElement(By.xpath("//button[text()=' Login ']"));
    }

    public void setUserName(WebDriver driver , String text){
        userName(driver).sendKeys(text);
    }

    public void setPassword(WebDriver driver , String text){
        password(driver).sendKeys(text);
    }

    public void setCode(WebDriver driver , String text){
        code(driver).sendKeys(text);
    }

    public void clickLoginBtn(WebDriver driver){
        clickLogin(driver).click();
    }


}
