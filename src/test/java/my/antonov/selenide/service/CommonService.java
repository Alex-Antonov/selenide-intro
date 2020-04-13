package my.antonov.selenide.service;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import my.antonov.selenide.pages.Page;

public class CommonService {

    private Page page;

    public CommonService(Page page) {
        this.page = page;
    }

    private String getText(SelenideElement element) {
        return element.getText();
    }

    private void clickButton(SelenideElement button){
        button.click();
    }

    private void inputText(SelenideElement field, String text){
        field.val(text);
    }

    private void isElementDisplayed(SelenideElement element){
        element.shouldBe(Condition.visible);
    }

    private void setCheckBox(SelenideElement element, boolean value){
        element.setSelected(value);
    }

    public void isTextVisible(String text) {
        isElementDisplayed(page.getElementByText(text));
    }

    public void checkTitle(String title) {
        isElementDisplayed(page.getTitle(title));
    }

    public void clickButton(String buttonName) {
        clickButton(page.getButton(buttonName));
    }

    public void fillInputText(String fieldName, String text) {
        inputText(page.getTextInput(fieldName), text);
    }

    public void setCheckBox(String checkBoxName, boolean value) {
        setCheckBox(page.getCheckBox(checkBoxName), value);
    }

    public String getTextFromElement(String fieldName) {
        return getText(page.getElementByName(fieldName));
    }
}
