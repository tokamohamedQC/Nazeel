import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver = null;
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    WebDriverWait wait;


    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait =  new WebDriverWait(driver, 20);
        driver.navigate().to("https://staging.nazeel.net:9002/login");
    }

//    @AfterTest
//    public void tearDown(){
//        driver.quit();
//    }

}
