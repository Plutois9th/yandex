package page;
import Data.Url;
import elements.Logo;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ResultPage {
    private final Url url = new Url("https://ya.ru/search/?text=%D0%9D%D0%B0%D0%B9%D1%82%D0%B8+%D1%87%D1%82%D0%BE-%D1%82%D0%BE+%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D0%B5%D1%81%D0%BD%D0%BE%D0%B5&lr=20050&search_source=yaru_desktop_common&search_domain=yaru",
            "ссылку на результат поиска");
    private final Logo logo = new Logo ("Лого Яндекса", $(By.cssSelector("svg path[fill]")));

    @Step("Открываем Яндекс")
    public ResultPage openPage() {
        url.openUrl();
        return this;
    }
    @Step("Проверяем цвет")
    public String logoCheck() {
        String color = logo.getCssValue("fill");
        return color;
    }
}
