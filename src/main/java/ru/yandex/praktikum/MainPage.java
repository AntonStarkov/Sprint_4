package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
// модификатор доступа public для параметризированного теста
    //Ссылка на первый раскрывающийся элемент блока "Вопросы о важном"
    public static final By FIRST_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL = By.id("accordion__heading-0");
    //Ссылка на второй раскрывающийся элемент блока "Вопросы о важном"
    public static final By SECOND_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL = By.id("accordion__heading-1");
    //Ссылка на третий раскрывающийся элемент блока "Вопросы о важном"
    public static final By THIRD_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL = By.id("accordion__heading-2");
    //Ссылка на четвертый раскрывающийся элемент блока "Вопросы о важном"
    public static final By FOURTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL = By.id("accordion__heading-3");
    //Ссылка на пятый раскрывающийся элемент блока "Вопросы о важном"
    public static final By FIFTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL = By.id("accordion__heading-4");
    //Ссылка на шестой раскрывающийся элемент блока "Вопросы о важном"
    public static final By SIXTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL = By.id("accordion__heading-5");
    //Ссылка на седьмой раскрывающийся элемент блока "Вопросы о важном"
    public static final By SEVENTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL = By.id("accordion__heading-6");
    //Ссылка на восьмой раскрывающийся элемент блока "Вопросы о важном"
    public static final By EIGHTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL = By.id("accordion__heading-7");
    //Ссылка на первый элемент с текстом из раскрывающейся панели блока "Вопросы о важном"
    public static final By FIRST_TEXT_ELEMENT_FROM_QUESTION_PANEL = By.xpath(".//*[@id='accordion__panel-0']/p");
    //Ссылка на второй элемент с текстом из раскрывающейся панели блока "Вопросы о важном"
    public static final By SECOND_TEXT_ELEMENT_FROM_QUESTION_PANEL = By.xpath(".//*[@id='accordion__panel-1']/p");
    //Ссылка на третий элемент с текстом из раскрывающейся панели блока "Вопросы о важном"
    public static final By THIRD_TEXT_ELEMENT_FROM_QUESTION_PANEL = By.xpath(".//*[@id='accordion__panel-2']/p");
    //Ссылка на четвертый элемент с текстом из раскрывающейся панели блока "Вопросы о важном"
    public static final By FOURTH_TEXT_ELEMENT_FROM_QUESTION_PANEL = By.xpath(".//*[@id='accordion__panel-3']/p");
    //Ссылка на пятый элемент с текстом из раскрывающейся панели блока "Вопросы о важном"
    public static final By FIFTH_TEXT_ELEMENT_FROM_QUESTION_PANEL = By.xpath(".//*[@id='accordion__panel-4']/p");
    //Ссылка на шестой элемент с текстом из раскрывающейся панели блока "Вопросы о важном"
    public static final By SIXTH_TEXT_ELEMENT_FROM_QUESTION_PANEL = By.xpath(".//*[@id='accordion__panel-5']/p");
    //Ссылка на седьмой элемент с текстом из раскрывающейся панели блока "Вопросы о важном"
    public static final By SEVENTH_TEXT_ELEMENT_FROM_QUESTION_PANEL = By.xpath(".//*[@id='accordion__panel-6']/p");
    //Ссылка на восьмой элемент с текстом из раскрывающейся панели блока "Вопросы о важном"
    public static final By EIGHTH_TEXT_ELEMENT_FROM_QUESTION_PANEL = By.xpath(".//*[@id='accordion__panel-7']/p");
    //Ссылка на кнопку "Заказать", расположенную в верхней части страницы
    public static final By BOTTOM_ORDER_BUTTON = By.xpath(".//button/parent::div[@class='Home_FinishButton__1_cWm']");
    //Ссылка на кнопку "Заказать", расположенную в нижней части страницы
    public static final By UPPER_ORDER_BUTTON = By.className("Button_Button__ra12g");
    private final WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String testingPage){
        driver.get(testingPage);
    }
    public void clickToUpperOrderButton(){
        driver.findElement(UPPER_ORDER_BUTTON).click();
    }
    public void clickToBottomOrderButton(){
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(BOTTOM_ORDER_BUTTON));
        WebElement elementToScroll = driver.findElement(BOTTOM_ORDER_BUTTON);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementToScroll);
        elementToScroll.click();
    }
    public void scrollToImportantQuestions(){
        WebElement elementToScroll = driver.findElement(EIGHTH_CLICKABLE_ELEMENT_FROM_QUESTION_PANEL);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementToScroll);
    }
    public void findClickablePanel(By clickablePanel){
        driver.findElement(clickablePanel).click();
    }
}