import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    

    public WebElement later(WebDriver driver){
        return driver.findElement(By.xpath("//span[text()=' Later']"));
    }

    public void clickLater(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(later(driver)));
        later(driver).click();
    }

    public WebElement reservation(WebDriver driver){
        return driver.findElement(By.xpath("//span[text()=' Reservations ']"));
    }

    public void clickReservation(WebDriver driver){
        reservation(driver).click();
    }

    public WebElement closeAlert(WebDriver driver){
        return driver.findElement(By.xpath("//button[@class=\"toast-close-button\"]"));
    }

    public void clickClose(WebDriver driver){
        if(closeAlert(driver).isDisplayed())
        {
            closeAlert(driver).click();
        }
    }

    public WebElement newReservation(WebDriver driver){
        return driver.findElement(By.xpath("//button[contains(@class,\"n-button n-button--green\")]"));
    }

    public void clickNewReservation(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(newReservation(driver)));
        newReservation(driver).click();
    }

    public WebElement visitDropDown(WebDriver driver){
        return driver.findElement(By.xpath("(//span[@class=\"k-select\"])[1]"));
    }

    public void clickVisitDropDown(WebDriver driver){
        visitDropDown(driver).click();
    }

    public void clickVisitOption(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).click().build().perform();
    }

    public WebElement reservationDropDown(WebDriver driver){
        return driver.findElement(By.xpath("(//span[@class=\"k-select\"])[2]"));
    }

    public void clickReservationDropDown(WebDriver driver){
        reservationDropDown(driver).click();
    }

    public void clickReservationOption(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).click().build().perform();
    }

    public WebElement selectUnit(WebDriver driver){
        return driver.findElement(By.xpath("//span[text()=' Select unit now ']"));
    }

    public void clickSelectUnit(WebDriver driver){
        selectUnit(driver).click();
    }

    public WebElement unitCard(WebDriver driver){
        return driver.findElement(By.xpath("(//div[@class='unit-card__overlay u-justify-end'])[1]"));
    }

    public void clickUnitCard(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(unitCard(driver)).click().build().perform();
    }

    public WebElement confirm(WebDriver driver){
        return driver.findElement(By.xpath("//span[text()='Confirm']"));
    }

    public void clickConfirm(WebDriver driver){
        confirm(driver).click();
    }

    public WebElement selectGuest(WebDriver driver){
        return driver.findElement(By.xpath("//span[text()='Select guest now']"));
    }

    public void clickSelectGuest(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(selectGuest(driver)));
        selectGuest(driver).click();
    }

    public WebElement idNumberInput(WebDriver driver){
        return driver.findElement(By.xpath("//input[@placeholder=\"ID Number\"]"));
    }

    public void setIDInput(WebDriver driver, String text){
        idNumberInput(driver).sendKeys(text);
    }

    public WebElement confirmGuest(WebDriver driver){
        return driver.findElement(By.xpath("//button[text()='Confirm']"));
    }

    public void clickConfirmGuest(WebDriver driver){
        confirmGuest(driver).click();
    }


    public WebElement searchGuest(WebDriver driver){
        return driver.findElement(By.xpath("//button[text()='Search']"));
    }

    public void clickSearchGuest(WebDriver driver){
        searchGuest(driver).click();
    }

    public WebElement guestRecord(WebDriver driver){
        return driver.findElement(By.xpath("(//tbody[@role=\"presentation\"])[2]"));
    }

    public void clickGuestRecord(WebDriver driver){
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(selectGuest(driver)));
        actions.moveToElement(guestRecord(driver)).doubleClick().build().perform();
    }

    public WebElement checkIn(WebDriver driver){
        return driver.findElement(By.xpath("//span[text()='Check-In']"));
    }

    public void clickCheckIn(WebDriver driver){
        checkIn(driver).click();
    }

    public WebElement checkInButton(WebDriver driver){
        return driver.findElement(By.xpath("//button[text()=' Check-In ']"));
    }

    public void clickCheckInButton(WebDriver driver){
        checkInButton(driver).click();
    }

    public WebElement successMessage(WebDriver driver){
        return driver.findElement(By.xpath("//div[@class=\"toast toast-success\"]"));
    }

    public String getSuccessMessage(WebDriver driver){
        return successMessage(driver).getText();
    }
}
