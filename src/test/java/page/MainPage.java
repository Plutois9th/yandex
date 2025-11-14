package page;
import Data.Url;
import elements.Buttons;
import elements.Input;
import elements.Logo;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;


public class MainPage {
    private final Url url = new Url("https://ya.ru", "ссылку на Яндекс");
    private final Input search = new Input("Поисковый запрос",
            $("#text"));
    private final Buttons find = new Buttons("Кнопку Найти",
            $(".search3__button.search3__button_icon_yes.mini-suggest__button"));
    private final Logo logo = new Logo ("Лого Яндекса", $(By.cssSelector("svg path[fill]")));

    @Step("Открываем Яндекс")
    public MainPage openPage() {
        url.openUrl();
        return this;
    }

    @Step("Вводим поисковый запрос")
    public MainPage inputSearch(String value) {
        search.setValue(value);
        return this;
    }

    @Step("Нажимаем кнопку Найти")
    public MainPage pushSearchBut() {
        find.click();
        return this;
    }
    @Step("Проверяем цвет")
    public String logoCheck() {
        String color = logo.getCssValue("fill");
        return color;
    }
}
