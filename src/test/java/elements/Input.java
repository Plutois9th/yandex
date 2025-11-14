package elements;

import com.codeborne.selenide.SelenideElement;

public class Input {
    private final String name;
    private final SelenideElement selector;

    public Input(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    public void setValue(String value) {
        System.out.println("Вводим" + " " + name);
        selector.setValue(value);
    }
    public void setKeys(String value){
        selector.click();
        selector.sendKeys(value);
    }
}
