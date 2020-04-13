package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsAddMoneyPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Пополнение счета")
public class InvestmentsAddMoneyPageService extends CommonService {

    @Autowired
    public InvestmentsAddMoneyPageService(InvestmentsAddMoneyPage page) {
        super(page);
    }

}
