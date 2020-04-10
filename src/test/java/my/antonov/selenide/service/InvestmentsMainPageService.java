package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsMainPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Главная страница")
public class InvestmentsMainPageService extends CommonService {

    @Autowired
    private InvestmentsMainPage investmentsMainPage;

    @Override
    public void checkTitle(String title) {
        isElementDisplayed(investmentsMainPage.getTitle(title));
    }

    @Override
    public void clickButton(String buttonName) {
        clickButton(investmentsMainPage.getButton(buttonName));
    }

    @Override
    public void fillInputText(String fieldName, String text) {
        inputText(investmentsMainPage.getTextInput(fieldName), text);
    }

    @Override
    public void setCheckBox(String checkBoxName, boolean value) {

    }
}
