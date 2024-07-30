package FirefoxTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.MainPage;

import static ru.yandex.praktikum.constants.MainPageConstants.*;

@RunWith(Parameterized.class)
public class MainPageQuestionPanel {
    private final String expectedText;
    private final By resultText;
    private final By clickablePanel;
    private WebDriver driver;

    //Конструктор для параметров ожидаемого текста, локаторов раскрывающейстя панели и локаторов текста внутри панели
    public MainPageQuestionPanel(String expectedText, By clickablePanel, By resultText){
        this.expectedText = expectedText;
        this.resultText = resultText;
        this.clickablePanel = clickablePanel;
    }
    @Parameterized.Parameters
    public static Object[][] getTextComparison(){
        return new Object[][] {
                {FIRST_EXPECTED_TEXT_FROM_QUESTION_PANEL, FIRST_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL, FIRST_TEXT_ELEMENT_FROM_QUESTION_PANEL},
                {SECOND_EXPECTED_TEXT_FROM_QUESTION_PANEL, SECOND_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL, SECOND_TEXT_ELEMENT_FROM_QUESTION_PANEL},
                {THIRD_EXPECTED_TEXT_FROM_QUESTION_PANEL, THIRD_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL, THIRD_TEXT_ELEMENT_FROM_QUESTION_PANEL},
                {FOURTH_EXPECTED_TEXT_FROM_QUESTION_PANEL, FOURTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL, FOURTH_TEXT_ELEMENT_FROM_QUESTION_PANEL},
                {FIFTH_EXPECTED_TEXT_FROM_QUESTION_PANEL, FIFTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL, FIFTH_TEXT_ELEMENT_FROM_QUESTION_PANEL},
                {SIXTH_EXPECTED_TEXT_FROM_QUESTION_PANEL, SIXTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL, SIXTH_TEXT_ELEMENT_FROM_QUESTION_PANEL},
                {SEVENTH_EXPECTED_TEXT_FROM_QUESTION_PANEL, SEVENTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL, SEVENTH_TEXT_ELEMENT_FROM_QUESTION_PANEL},
                {EIGHTH_EXPECTED_TEXT_FROM_QUESTION_PANEL, EIGHTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL, EIGHTH_TEXT_ELEMENT_FROM_QUESTION_PANEL},
        };
    }

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @Test
    public void testMainPageQuestionPanel(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage(MAINPAGE_URL);
        mainPage.scrollToImportantQuestions();
        mainPage.findClickablePanel(clickablePanel);
        Assert.assertEquals(driver.findElement(resultText).getText(), expectedText);
    }
    @After
    public void closeDriverSession(){
        driver.quit();
    }
}
