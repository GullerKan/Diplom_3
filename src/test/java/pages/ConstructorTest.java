package pages;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConstructorTest extends Base {
    @Test
    @DisplayName("Переход к разделу 'Булки'")
    public void goBuns(){
        home.clickSaucesButton();
        assertTrue(home.isBuns());
        home.clickBunButton();
        actual = home.getBuns();
        assertEquals("Булки",actual);
    }
    @Test
    @DisplayName("Переход к разделу 'Соусы'")
    public void goSauces(){
        home.clickSaucesButton();
        actual = home.getSauces();
        assertTrue(home.isSauces());
        assertEquals("Соусы",actual);
    }
    @Test
    @DisplayName("Переход к разделу 'Начинки'")
    public void goFillings(){
        home.clickFillingsButton();
        actual = home.getFillings();
        assertTrue(home.isFillings());
        assertEquals("Начинки",actual);
    }
}
