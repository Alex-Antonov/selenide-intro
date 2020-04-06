/**
 * Базовый сервис, где будет реализация всех
 * базовых действия над WebElement-ами:
 * ввод текста, нажатие, проверка отображения и т.п.
 */
package my.antonov.selenide.service;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import my.antonov.selenide.pages.Element;
import my.antonov.selenide.pages.Page;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CommonService {

    protected SelenideElement getFromMap(Map<Element, SelenideElement> map, Element name){
        return map.get(name);
    }

    public String getText(Page obj, Element element) {
        return getFromMap(obj.getElements(), element).getText();
    }

    public void clickButton(Page obj, Element button){
        getFromMap(obj.getElements(), button).click();
    }

    public void inputText(Page obj, Element field, String text){
        getFromMap(obj.getElements(), field).setValue(text);
    }

    public void isElementDisplayed(Page obj, Element element){
        getFromMap(obj.getElements(), element).shouldBe(Condition.visible);
    }
}
