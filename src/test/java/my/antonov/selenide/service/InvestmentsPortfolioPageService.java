package my.antonov.selenide.service;


import my.antonov.selenide.pages.InvestmentsPortfolioPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Портфель")
public class InvestmentsPortfolioPageService extends CommonService {

    @Autowired
    private InvestmentsPortfolioPage investmentsPortfolioPage;

    @Override
    public void checkTitle(String title) {

    }

    @Override
    public void clickButton(String buttonName) {
        clickButton(investmentsPortfolioPage.getButton(buttonName));
    }

    @Override
    public void fillInputText(String fieldName, String text) {

    }

    @Override
    public void setCheckBox(String checkBoxName, boolean value) {

    }
}
