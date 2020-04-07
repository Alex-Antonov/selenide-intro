package my.antonov.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

/**
 * PageObject страницы О компании
 * с описанием некоторых ее веб-элементов
 */
@Getter
@Component
public class AboutCompanyPage implements Page {
    @Override
    public SelenideElement getTitle(String title) {
        return $(By.xpath("//h1[text()='" + title + "']"));
    }

    @Override
    public SelenideElement getTextInput(String fieldName) {
        return null;
    }

    @Override
    public SelenideElement getButton(String buttonName) {
        return null;
    }
}
