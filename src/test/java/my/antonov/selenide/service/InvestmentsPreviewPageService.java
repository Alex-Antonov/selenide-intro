package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsPreviewPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Превью")
public class InvestmentsPreviewPageService extends CommonService {

    @Autowired
    private InvestmentsPreviewPage investmentsPreviewPage;

    @Override
    public void checkTitle(String title) {
        isElementDisplayed(investmentsPreviewPage.getTitle(title));
    }

    @Override
    public void clickButton(String buttonName) {
        clickButton(investmentsPreviewPage.getButton(buttonName));
    }

    @Override
    public void fillInputText(String fieldName, String text) {

    }

    @Override
    public void setCheckBox(String checkBoxName, boolean value) {

    }
}
