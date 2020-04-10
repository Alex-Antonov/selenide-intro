package my.antonov.selenide.service;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

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

    protected void setCheckBox(SelenideElement element, boolean value){
        element.setSelected(value);
    }

    public void isTextVisible(String text) {
        isElementDisplayed($(byText(text)));
    }

    public abstract void checkTitle(String title);

    public abstract void clickButton(String buttonName);

    public abstract void fillInputText(String fieldName, String text);

    public abstract void setCheckBox(String checkBoxName, boolean value);
}
