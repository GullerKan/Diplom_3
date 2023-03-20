package pages;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginTest extends Base{
    @Test
    @DisplayName("Авторизация через кнопку 'Войти в аккаунт' на Главной")
    public void loginOnHomePage(){
        home.clickEnterButton();
        login.loginSteps("test@te.st","123456");
        actual = home.getCheckoutButtonsText();
        assertEquals("Оформить заказ",actual);
    }
    @Test
    @DisplayName("Авторизация через кнопку 'Войти в аккаунт' на Главной")
    public void loginOnProfile(){
        home.clickProfileButton();
        login.loginSteps("test@te.st","123456");
        actual = home.getCheckoutButtonsText();
        assertEquals("Оформить заказ",actual);
    }
    @Test
    @DisplayName("Авторизация через кнопку в форме регистрации")
    public void loginOnRegistrationScreen(){
        home.clickProfileButton();
        login.clickRegistrationButton();
        registration.clickEnterButton();
        login.loginSteps("test@te.st","123456");
        actual = home.getCheckoutButtonsText();
        assertEquals("Оформить заказ",actual);
    }
    @Test
    @DisplayName("Авторизация через кнопку в форме восстановления пароля")
    public void loginOnRestoreScreen(){
        home.clickProfileButton();
        login.clickRestoreButton();
        restore.clickEnterButton();
        login.loginSteps("test@te.st","123456");
        actual = home.getCheckoutButtonsText();
        assertEquals("Оформить заказ",actual);
    }
}
