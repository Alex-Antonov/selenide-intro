package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsPortfolioPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Портфель")
public class InvestmentsPortfolioPageService extends CommonService {

    @Autowired
    public InvestmentsPortfolioPageService(InvestmentsPortfolioPage page) {
        super(page);
    }

}
