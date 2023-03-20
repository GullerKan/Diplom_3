package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    private final WebDriver driver;

    private By profileButton = By.xpath(".//a[contains(text(), 'Профиль')]");
    private By logoButton = By.className("AppHeader_header__logo__2D0X2");
    private By constructorButton = By.className("AppHeader_header__link__3D_hX");
    private By logoutButton = By.xpath(".//button[contains(text(), 'Выход')]");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Клик 'stellar burgers'")
    public void clickLogoButton() {
        driver.findElement(logoButton).click();
    }
    @Step("Клик 'Конструктор'")
    public void clickConstructorButton() {
        driver.findElement(constructorButton).click();
    }
    @Step("Клик по кнопке 'Выход'")
    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }
    @Step("Проверка видимости кнопки 'Профиль'")
    public boolean isProfileButton() {
        return driver.findElement(profileButton).isDisplayed();
    }
}
