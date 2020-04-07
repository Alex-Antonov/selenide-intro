package my.antonov.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;

/**
 * PageObject страницы Стать клиентом
 * с описанием некоторых ее веб-элементов
 */
@Getter
@Component
public class BecomeCustomerPage implements Page {

    @Override
    public SelenideElement getTitle(String title) {
        return $(By.xpath("//h2[text()='" + title + "']"));
    }

    @Override
    public SelenideElement getTextInput(String fieldName) {
        return element(By.xpath("//td[contains(text(),'" + fieldName + "')]/div/input"));
    }

    @Override
    public SelenideElement getButton(String buttonName) {
        return $(By.xpath("//nav/a[contains(text(), '" + buttonName + "')]"));
    }
}
