package ChromeTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.praktikum.OrderPage;

import java.time.Duration;

import static ru.yandex.praktikum.constants.OrderPageConstants.ORDERPAGE_URL;
import static ru.yandex.praktikum.constants.OrderPageConstants.ORDER_PROCESSED_TEXT;

public class CreateOrder {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }



    @Test
    public void testOrderPage(){
        OrderPage orderPage = new OrderPage(driver);
        orderPage.openPage(ORDERPAGE_URL);
        orderPage.firstFormFilling("Имя", "Фамилия", "Адрес", "Кантемировская", "111222333444");
        orderPage.nextButtonClick();
        orderPage.secondFormFilling("next", (byte) 11, (byte) 4, "greyAndBlack", "Комментарии");
        orderPage.orderButtonClick();
        orderPage.confirmOrderButtonClick();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(ORDER_PROCESSED_TEXT)); //bugged
    }
    @After
    public void closeDriverSession(){
        driver.quit();
    }
}
