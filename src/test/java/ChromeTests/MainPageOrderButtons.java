package ChromeTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.MainPage;

import static org.junit.Assert.assertEquals;
import static ru.yandex.praktikum.constants.OrderPageConstants.ORDERPAGE_URL;
import static ru.yandex.praktikum.constants.MainPageConstants.MAINPAGE_URL;

public class MainPageOrderButtons {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
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
