package elements;

import com.codeborne.selenide.SelenideElement;

public class Logo {

    private final String name;
    private final SelenideElement selector;

    public Logo(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    public String getCssValue(String fill) {
        System.out.println("Получаем цвет лого");
        var color = selector.getCssValue(fill);
        return color;
    }
}