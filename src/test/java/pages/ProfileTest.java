package pages;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProfileTest extends Base{
    @Test
    @DisplayName("Переход в личный кабинет")
    public void goToProfile(){
        home.clickProfileButton();
        login.loginSteps("test@te.st","123456");
        home.clickProfileButton();
        assertTrue(profile.isProfileButton());
    }
    @Test
    @DisplayName("Переход из личного кабинета в конструктор")
    public void goToConstructor(){
        home.clickProfileButton();
        profile.clickConstructorButton();
        home.clickProfileButton();
        login.loginSteps("test@te.st","123456");
        home.clickProfileButton();
        profile.clickConstructorButton();
        assertTrue(home.isConstructorTitle());
    }
    @Test
    @DisplayName("Переход из личного кабинета по клику на логотип Stellar Burgers")
    public void goToHomePage(){
        home.clickProfileButton();
        profile.clickLogoButton();
        home.clickProfileButton();
        login.loginSteps("test@te.st","123456");
        home.clickProfileButton();
        profile.clickLogoButton();
        assertTrue(home.isConstructorTitle());
    }
    @Test
    @DisplayName("Выход из аккаунта")
    public void logout(){
        home.clickProfileButton();
        login.loginSteps("test@te.st","123456");
        home.clickProfileButton();
        profile.clickLogoutButton();
        actual = login.getEnterText();
        assertEquals("Войти",actual);
    }
}
