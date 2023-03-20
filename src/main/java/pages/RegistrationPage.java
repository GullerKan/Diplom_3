package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    private final WebDriver driver;

    private By logoButton = By.className("AppHeader_header__logo__2D0X2");
    private By constructorButton = By.className("AppHeader_header__link__3D_hX");
    private By nameField = By.xpath("(//input[@name='name'])[1]");
    private By emailField = By.xpath("(//input[@name='name'])[2]");
    private By passwordField = By.xpath("//input[@name='Пароль']");
    private By registrationButton = By.xpath(".//button[contains(text(), 'Зарегистрироваться')]");
    private By enterButton = By.xpath(".//a[contains(text(), 'Войти')]");
    private By errorText = By.xpath(".//p[contains(text(), 'Такой пользователь уже существует')]");
    private By errorPassText = By.xpath(".//p[contains(text(), 'Некорректный пароль')]");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Клик 'Войти'")
    public void clickEnterButton() {
        driver.findElement(enterButton).click();
    }
    @Step("Заполнение поля Имя")
    public void setName(String name) {
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(name);
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
    @Step("Клик 'stellar burgers'")
    public void clickLogoButton() {
        driver.findElement(logoButton).click();
    }
    @Step("Клик 'Конструктор'")
    public void clickConstructorButton() {
        driver.findElement(constructorButton).click();
    }
    @Step("Клик 'Зарегистрироваться'")
    public void clickRegistrationButton() {
        WebElement element = driver.findElement(registrationButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(registrationButton).click();
    }
    @Step("Получение текста ошибки")
    public String getErrorText() {
        return driver.findElement(errorText).getText();
    }
    @Step("Получение текста 'Некорректный пароль'")
    public String getErrorPassText() {
        return driver.findElement(errorPassText).getText();
    }
    @Step("Регистрация")
    public void registrationSteps(String name, String email, String password) {
        setName(name);
        setEmail(email);
        setPassword(password);
        clickRegistrationButton();
    }
}