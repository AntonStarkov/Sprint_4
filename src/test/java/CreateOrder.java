import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.OrderPage;

public class CreateOrder {
    //Ссылка на страницу создания заказа
    private static final String ORDERPAGE_URL = "https://qa-scooter.praktikum-services.ru/order";
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = TestData.getWebDriver();
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
        orderPage.getOrderProcessedText(); //chrome bugged
    }
    @After
    public void closeDriverSession(){
        driver.quit();
    }
}
