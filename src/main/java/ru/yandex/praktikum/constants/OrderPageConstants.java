package ru.yandex.praktikum.constants;

import org.openqa.selenium.By;

public class OrderPageConstants {
    //Ссылка на страницу создания заказа
    public static final String ORDERPAGE_URL = "https://qa-scooter.praktikum-services.ru/order";
    //Ссылка на поле ввода имени
    public static final By NAME_FIELD = By.xpath(".//input[@placeholder='* Имя']");
    //Ссылка на поле ввода фамилии
    public static final By SURNAME_FIELD = By.xpath(".//input[@placeholder='* Фамилия']");
    //Ссылка на поле ввода адреса
    public static final By ADDRESS_FIELD = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Ссылка на поле ввода\выбора станции метро
    public static final By METRO_FIELD = By.className("select-search__input");
    //Ссылка на поле ввода номера телефона
    public static final By PHONE_NUMBER_FIELD = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Ссылка на кнопку "Далее", первой формы оформления заказа
    public static final By NEXT_BUTTON = By.xpath(".//button[text()='Далее']");
    //Ссылка на поле ввода\выбора даты доставки самоката
    public static final By CALENDAR_FIELD = By.xpath(".//input/parent::div[@class='react-datepicker__input-container']");
    //Ссылка на поле выбора срока аренды самоката
    public static final By RENTAL_FIELD = By.xpath(".//div[@class='Dropdown-placeholder']");
    //Ссылка на чекбокс выбора серого цвета самоката
    public static final By SCOOTER_COLOUR_GREY_CHECKBOX = By.id("grey");
    //Ссылка на чекбокс выбора черного цвета самоката
    public static final By SCOOTER_COLOUR_BLACK_CHECKBOX = By.id("black");
    //Ссылка на поле ввода комментария
    public static final By COMMENTS_FIELD = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Ссылка на кнопку "Заказать"
    public static final By ORDER_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Ссылка на кнопку "Да" для подтверждения заказа
    public static final By CONFIRM_ORDER_BUTTON = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    //Ссылка на элемент "Заказ оформлен" при успешном оформлении заказа
    public static final By ORDER_PROCESSED_TEXT = By.xpath(".//div[text()='Заказ оформлен']");
}
