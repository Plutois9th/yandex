package test;
import Data.ValidData;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.MainPage;
import settings.TestSettings;
import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("Проверка Яндекс") public class CheckMainPageTest extends TestSettings {
    MainPage mainPage = new MainPage();
    ValidData validData = new ValidData();

    @Test
    @DisplayName("Ввод поискового запроса и проверка значка")
    public void findSmth() {
        mainPage.openPage()
                .inputSearch(validData.getSearch())
                .pushSearchBut();
        Selenide.sleep(5000);




        assertThat(mainPage.logoCheck()).as("Цвет лого совпадает")
                .isEqualTo(validData.getLogoColor());
        Selenide.sleep(5000);
    }
}
