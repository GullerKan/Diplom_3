package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Base {
    protected static WebDriver driver;
    HomePage home;
    LoginPage login;
    RegistrationPage registration;
    RestorePasswordPage restore;
    ProfilePage profile;
    String actual;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site");
        home = new HomePage(driver);
        login = new LoginPage(driver);
        registration = new RegistrationPage(driver);
        restore = new RestorePasswordPage(driver);
        profile = new ProfilePage(driver);
    }

    @After
    public void tearDown() {
       driver.quit();
    }
}
