package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsPortfolioPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Портфель")
public class InvestmentsPortfolioPageService extends CommonService {

    private InvestmentsPortfolioPage page;

    @Autowired
    public InvestmentsPortfolioPageService(InvestmentsPortfolioPage page) {
        super(page);
        this.page = page;
    }

    public void clickButtonOnElement(String fieldName, String elementName) {
        clickButton(page.getButtonOnElement(elementName, fieldName));
    }

}
