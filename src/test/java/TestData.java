import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestData {
    //записываем в переменную имя браузера из окружения
    private static final String VALUE_OF_BROWSER_NAME_ENV = System.getenv("BROWSER_NAME");
    static WebDriver switchWebDriver(Browser browser){
        switch (browser){
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            default:
                throw new RuntimeException("can't create driver");
        }
    }
    static WebDriver getWebDriver(){
        return switchWebDriver(Browser.valueOf(VALUE_OF_BROWSER_NAME_ENV));
    }
    enum Browser{
        CHROME, FIREFOX;
    }
}
