package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ru.yandex.praktikum.constants.OrderPageConstants.*;

public class OrderPage {
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
        driver.findElement(By.xpath(".//div[text()='" + metroName + "']")).click(); //Кантемировская
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
}
