import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReservationTest extends TestBase{

    SoftAssert softAssert = new SoftAssert();
    @Test
    public void Reservation() throws InterruptedException {
        loginPage.setUserName(driver,"Toka");
        loginPage.setPassword(driver,"Aa@123456");
        loginPage.setCode(driver,"01373");
        loginPage.clickLoginBtn(driver);
        wait.until(ExpectedConditions.urlToBe("https://staging.nazeel.net:9002/dashboard"));
        softAssert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        homePage.clickLater(driver);
        homePage.clickReservation(driver);
        wait.until(ExpectedConditions.urlToBe("https://staging.nazeel.net:9002/reservations"));
        softAssert.assertTrue(driver.getCurrentUrl().contains("reservations"));
        homePage.clickNewReservation(driver);
        homePage.clickVisitDropDown(driver);
        homePage.clickVisitOption(driver);
        homePage.clickReservationDropDown(driver);
        homePage.clickReservationOption(driver);
        homePage.clickSelectUnit(driver);
        homePage.clickUnitCard(driver);
        homePage.clickConfirm(driver);
        Thread.sleep(1000);
        homePage.clickSelectGuest(driver);
        homePage.setIDInput(driver, "123456789");
        homePage.clickSearchGuest(driver);
        Thread.sleep(1000);
        homePage.clickGuestRecord(driver);
        homePage.clickConfirmGuest(driver);
        homePage.clickCheckIn(driver);
        homePage.clickCheckInButton(driver);
        softAssert.assertTrue(homePage.getSuccessMessage(driver).contains("Saved Successfully"));
        softAssert.assertAll();
    }
}
