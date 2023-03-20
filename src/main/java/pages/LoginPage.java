package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final WebDriver driver;
    private By emailField = By.xpath(".//input[@name = 'name']");
    private By passwordField = By.xpath(".//input[@name = 'Пароль']");
    private By enterButton = By.xpath(".//button[contains(text(), 'Войти')]");
    private By registrationButton = By.xpath(".//a[contains(text(), 'Зарегистрироваться')]");
    private By restoreButton = By.xpath(".//a[contains(text(), 'Восстановить пароль')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Клик по кнопке 'Войти'")
    public void clickEnterButton() {
        driver.findElement(enterButton).click();
    }
    @Step("Заполнение поля Email")
    public void setEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }
    @Step("Заполнение поля Password")
    public void setPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }
    @Step("Получение текста кнопки 'Войти'")
    public String getEnterText() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(enterButton));
        return driver.findElement(enterButton).getText();
    }
    @Step("Клик по кнопке 'Зарегистрироваться'")
    public void clickRegistrationButton() {
        driver.findElement(registrationButton).click();
    }
    @Step("Клик по кнопке 'Восстановить пароль'")
    public void clickRestoreButton() {
        driver.findElement(restoreButton).click();
    }
    @Step("Авторизация'")
    public void loginSteps(String email, String password){
        setEmail(email);
        setPassword(password);
        clickEnterButton();
    }
}
