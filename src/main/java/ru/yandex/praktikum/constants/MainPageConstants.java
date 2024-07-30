package ru.yandex.praktikum.constants;

import org.openqa.selenium.By;

public class MainPageConstants {
    //Ожидаемый текст внутри первого раскрытого элемента блока "Вопросы о важном"
    public static final String FIRST_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //Ожидаемый текст внутри второго раскрытого элемента блока "Вопросы о важном"
    public static final String SECOND_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //Ожидаемый текст внутри третьего раскрытого элемента блока "Вопросы о важном"
    public static final String THIRD_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //Ожидаемый текст внутри четвертого раскрытого элемента блока "Вопросы о важном"
    public static final String FOURTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //Ожидаемый текст внутри пятого раскрытого элемента блока "Вопросы о важном"
    public static final String FIFTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //Ожидаемый текст внутри шестого раскрытого элемента блока "Вопросы о важном"
    public static final String SIXTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //Ожидаемый текст внутри седьмого раскрытого элемента блока "Вопросы о важном"
    public static final String SEVENTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //Ожидаемый текст внутри восьмого раскрытого элемента блока "Вопросы о важном"
    public static final String EIGHTH_EXPECTED_TEXT_FROM_QUESTION_PANEL = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
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
    //Ссылка на стартовую страницу ЯндексСамокат
    public static final String MAINPAGE_URL = "https://qa-scooter.praktikum-services.ru";
}
