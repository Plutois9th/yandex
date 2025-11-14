package Data;

import lombok.Data;
import com.codeborne.selenide.Selenide;

@Data

public class Url {
    private final String URL;
    private final String name;

    public Url(String URL, String name) {
        this.URL = URL;
        this.name = name;
    }

    public void openUrl() {
        System.out.println("Открываем" + " " + name);
        Selenide.open(URL);
    }
}
