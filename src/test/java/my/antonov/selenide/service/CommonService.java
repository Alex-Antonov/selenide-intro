package my.antonov.selenide.service;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Service;


/**
 * Базовый сервис, где будет реализация всех
 * базовых действия над WebElement-ами:
 * ввод текста, нажатие, проверка отображения и т.п.
 * Также набор абстрактных методов, которые следует
 * реализовать для каждого отдельного сервиса закрепленным
 * за своим PageObject
 */
@Service
public abstract class CommonService {

    protected String getText(SelenideElement element) {
        return element.getText();
    }

    protected void clickButton(SelenideElement button){
        button.click();
    }

    protected void inputText(SelenideElement field, String text){
        field.val(text);
    }

    protected void isElementDisplayed(SelenideElement element){
        element.shouldBe(Condition.visible);
    }

    public abstract void checkTitle(String title);

    public abstract void clickButton(String buttonName);

    public abstract void fillInputText(String fieldName, String text);
}
