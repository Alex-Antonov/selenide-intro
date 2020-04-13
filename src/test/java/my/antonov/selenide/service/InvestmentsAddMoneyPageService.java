package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsAddMoneyPage;
import my.antonov.selenide.pages.InvestmentsPortfolioPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Пополнение счета")
public class InvestmentsAddMoneyPageService extends CommonService {

    @Autowired
    private InvestmentsAddMoneyPage investmentsAddMoneyPage;

    @Override
    public void checkTitle(String title) {

    }

    @Override
    public void clickButton(String buttonName) {
        clickButton(investmentsAddMoneyPage.getButton(buttonName));
    }

    @Override
    public void fillInputText(String fieldName, String text) {
        inputText(investmentsAddMoneyPage.getTextInput(fieldName), text);
    }

    @Override
    public void setCheckBox(String checkBoxName, boolean value) {

    }
}
