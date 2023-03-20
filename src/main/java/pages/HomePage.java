package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private final WebDriver driver;
    private By profileButton = By.xpath(".//p[contains(text(), 'Личный Кабинет')]");
    private By enterButton = By.xpath(".//button[contains(text(), 'Войти в аккаунт')]");
    private By checkoutButton = By.xpath(".//button[contains(text(), 'Оформить заказ')]");
    private By constructorTitle = By.xpath(".//h1[contains(text(), 'Соберите бургер')]");
    private By bunButton = By.xpath(".//span[contains(text(), 'Булки')]");
    private By saucesButton = By.xpath(".//span[contains(text(), 'Соусы')]");
    private By fillingsButton = By.xpath(".//span[contains(text(), 'Начинки')]");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Клик по кнопке 'Войти в аккаунт'")
    public void clickEnterButton() {
        driver.findElement(enterButton).click();
    }
    @Step("Клик по кнопке 'Личный кабинет'")
    public void clickProfileButton() {
        driver.findElement(profileButton).click();
    }
    @Step("Клик по табе 'Булки'")
    public void clickBunButton() {
        driver.findElement(bunButton).click();
    }
    @Step("Клик по табе 'Соусы'")
    public void clickSaucesButton() {
        driver.findElement(saucesButton).click();
    }
    @Step("Клик по табе 'Начинки'")
    public void clickFillingsButton() {
        driver.findElement(fillingsButton).click();
    }
    @Step("Получение текста кнопки 'Оформить заказ'")
    public String getCheckoutButtonsText() {
        return driver.findElement(checkoutButton).getText();
    }
    public boolean isConstructorTitle() {
        return driver.findElement(constructorTitle).isDisplayed();
    }
    public boolean isBuns() {
        return driver.findElement(bunButton).isDisplayed();
    }
    @Step("Получение текста табы 'Булки'")
    public String getBuns() {
        return driver.findElement(bunButton).getText();
    }
    public boolean isSauces() {
        return driver.findElement(saucesButton).isDisplayed();
    }
    @Step("Получение текста табы 'Соусы'")
    public String getSauces() {
        return driver.findElement(saucesButton).getText();
    }
    public boolean isFillings() {
        return driver.findElement(fillingsButton).isDisplayed();
    }
    @Step("Получение текста табы 'Начинки'")
    public String getFillings() {
        return driver.findElement(fillingsButton).getText();
    }
}
