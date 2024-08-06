package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    //Ссылка на поле ввода имени
    private static final By NAME_FIELD = By.xpath(".//input[@placeholder='* Имя']");
    //Ссылка на поле ввода фамилии
    private static final By SURNAME_FIELD = By.xpath(".//input[@placeholder='* Фамилия']");
    //Ссылка на поле ввода адреса
    private static final By ADDRESS_FIELD = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Ссылка на поле ввода\выбора станции метро
    private static final By METRO_FIELD = By.className("select-search__input");
    //Ссылка на поле ввода номера телефона
    private static final By PHONE_NUMBER_FIELD = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Ссылка на кнопку "Далее", первой формы оформления заказа
    private static final By NEXT_BUTTON = By.xpath(".//button[text()='Далее']");
    //Ссылка на поле ввода\выбора даты доставки самоката
    private static final By CALENDAR_FIELD = By.xpath(".//input/parent::div[@class='react-datepicker__input-container']");
    //Ссылка на поле выбора срока аренды самоката
    private static final By RENTAL_FIELD = By.xpath(".//div[@class='Dropdown-placeholder']");
    //Ссылка на чекбокс выбора серого цвета самоката
    private static final By SCOOTER_COLOUR_GREY_CHECKBOX = By.id("grey");
    //Ссылка на чекбокс выбора черного цвета самоката
    private static final By SCOOTER_COLOUR_BLACK_CHECKBOX = By.id("black");
    //Ссылка на поле ввода комментария
    private static final By COMMENTS_FIELD = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Ссылка на кнопку "Заказать"
    private static final By ORDER_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Ссылка на кнопку "Да" для подтверждения заказа
    private static final By CONFIRM_ORDER_BUTTON = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    //Ссылка на элемент "Заказ оформлен" при успешном оформлении заказа
    private static final By ORDER_PROCESSED_TEXT = By.xpath(".//div[text()='Заказ оформлен']");
    private final WebDriver driver;
    public OrderPage(WebDriver driver){
        this.driver = driver;
    }
    public void openPage(String testingPage){
        driver.get(testingPage);
    }
    public void firstFormFilling(String nameField, String surnameField, String addressField, String metroName, String phoneNumberField){
        driver.findElement(NAME_FIELD).sendKeys(nameField);
        driver.findElement(SURNAME_FIELD).sendKeys(surnameField);
        driver.findElement(ADDRESS_FIELD).sendKeys(addressField);
        driver.findElement(METRO_FIELD).click();
        WebElement elementToScroll = driver.findElement(By.xpath(".//div[text()='" + metroName + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementToScroll);
        driver.findElement(By.xpath(".//div[text()='" + metroName + "']")).click();
        driver.findElement(PHONE_NUMBER_FIELD).sendKeys(phoneNumberField);
    }
    public void secondFormFilling(String monthButton, byte dayOfTheMonth, byte numberOfRentalDays, String scooterColour, String commentsField){
        driver.findElement(CALENDAR_FIELD).click();
        if(monthButton.equals("previous")){
            driver.findElement(By.xpath(".//button[@class='react-datepicker__navigation react-datepicker__navigation--previous']")).click();
        } else if (monthButton.equals("next")){
            driver.findElement(By.xpath(".//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
        }
        driver.findElement(By.xpath(".//div[contains(@class, 'react-datepicker__day--0" + dayOfTheMonth + "')]")).click();
        driver.findElement(RENTAL_FIELD).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[" + numberOfRentalDays + "]")).click();

        if(scooterColour.equals("grey") || scooterColour.equals("black")){
            driver.findElement(By.id(scooterColour)).click();
        } else if (scooterColour.equals("greyAndBlack")){
            driver.findElement(SCOOTER_COLOUR_GREY_CHECKBOX).click();
            driver.findElement(SCOOTER_COLOUR_BLACK_CHECKBOX).click();
        }
        driver.findElement(COMMENTS_FIELD).sendKeys(commentsField);
    }
    public void nextButtonClick(){
        driver.findElement(NEXT_BUTTON).click();
    }
    public void orderButtonClick(){
        driver.findElement(ORDER_BUTTON).click();
    }
    public void confirmOrderButtonClick(){
        driver.findElement(CONFIRM_ORDER_BUTTON).click();
    }
    public void getOrderProcessedText(){
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(ORDER_PROCESSED_TEXT));
    }
}
