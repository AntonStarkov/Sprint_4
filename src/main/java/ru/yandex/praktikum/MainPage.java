package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.yandex.praktikum.constants.MainPageConstants.*;

public class MainPage {
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