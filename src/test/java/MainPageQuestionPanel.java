import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.MainPage;


import static ru.yandex.praktikum.MainPage.*;

@RunWith(Parameterized.class)
public class MainPageQuestionPanel {
    //Ожидаемый текст внутри первого раскрытого элемента блока "Вопросы о важном"
    private static final String FIRST_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //Ожидаемый текст внутри второго раскрытого элемента блока "Вопросы о важном"
    private static final String SECOND_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //Ожидаемый текст внутри третьего раскрытого элемента блока "Вопросы о важном"
    private static final String THIRD_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //Ожидаемый текст внутри четвертого раскрытого элемента блока "Вопросы о важном"
    private static final String FOURTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //Ожидаемый текст внутри пятого раскрытого элемента блока "Вопросы о важном"
    private static final String FIFTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //Ожидаемый текст внутри шестого раскрытого элемента блока "Вопросы о важном"
    private static final String SIXTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //Ожидаемый текст внутри седьмого раскрытого элемента блока "Вопросы о важном"
    private static final String SEVENTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //Ожидаемый текст внутри восьмого раскрытого элемента блока "Вопросы о важном"
    private static final String EIGHTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    //Ссылка на стартовую страницу ЯндексСамокат
    private static final String MAINPAGE_URL = "https://qa-scooter.praktikum-services.ru";
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
        driver = TestData.getWebDriver();
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
