import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.MainPage;

import static org.junit.Assert.assertEquals;

public class MainPageOrderButtons {
    private WebDriver driver;
    //Ссылка на стартовую страницу ЯндексСамокат
    private static final String MAINPAGE_URL = "https://qa-scooter.praktikum-services.ru";
    //Ссылка на страницу создания заказа
    private static final String ORDERPAGE_URL = "https://qa-scooter.praktikum-services.ru/order";
    @Before
    public void setUp() throws Exception {
        driver = TestData.getWebDriver();
    }
    @Test
    public void clickToBottomOrderButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage(MAINPAGE_URL);
        mainPage.clickToBottomOrderButton();
        assertEquals(driver.getCurrentUrl(), ORDERPAGE_URL);

    }
    @Test
    public void clickToUpperOrderButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage(MAINPAGE_URL);
        mainPage.clickToUpperOrderButton();
        assertEquals(driver.getCurrentUrl(), ORDERPAGE_URL);
    }
    @After
    public void closeDriverSession(){
        driver.quit();
    }
}
