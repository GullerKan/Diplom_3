package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestorePasswordPage {
    private final WebDriver driver;

    private By logoButton = By.className("AppHeader_header__logo__2D0X2");
    private By constructorButton = By.className("AppHeader_header__link__3D_hX");
    private By emailField = By.xpath(".//div[@class = 'input pr-6 pl-6 input_type_text input_size_default']/label[@name = 'Email']");
    private By restoreButton = By.xpath(".//button[contains(text(), 'Восстановить')]");
    private By enterButton = By.xpath(".//a[contains(text(), 'Войти')]");

    public RestorePasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickRestoreButton() {
        driver.findElement(restoreButton).click();
    }
    public void clickLogoButton() {
        driver.findElement(logoButton).click();
    }
    public void clickConstructorButton() {
        driver.findElement(constructorButton).click();
    }
    @Step("Клик по кнопке 'Войти'")
    public void clickEnterButton() {
        driver.findElement(enterButton).click();
    }
}
