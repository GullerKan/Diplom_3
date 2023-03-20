package pages;

import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RegistrationTest extends Base{
    private String name = RandomStringUtils.randomAlphanumeric(6);
    private String email = RandomStringUtils.randomAlphanumeric(6) + "@yandex.ru";
    private String password = "123456";

    @Test
    @DisplayName("Успешная регистрация")
    public void succsessRegisration(){
        home.clickEnterButton();
        login.clickRegistrationButton();
        registration.registrationSteps(name,email,password);
        actual = login.getEnterText();
        assertEquals("Войти",actual);
    }
    @Test
    @DisplayName("Попытка регистрации существующего пользователя")
    public void errorRegisration(){
        home.clickEnterButton();
        login.clickRegistrationButton();
        registration.registrationSteps("Тест","test@te.st","123456");
        actual = registration.getErrorText();
        assertEquals("Такой пользователь уже существует",actual);
    }
    @Test
    @DisplayName("Попытка регистрации пользователя c некорректным паролем")
    public void regisrationWithIncorrectPass(){
        home.clickEnterButton();
        login.clickRegistrationButton();
        registration.registrationSteps(name,email,"12345");
        actual = registration.getErrorPassText();
        assertEquals("Некорректный пароль",actual);
    }

}
