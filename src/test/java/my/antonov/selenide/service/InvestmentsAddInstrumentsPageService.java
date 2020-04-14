package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsAddInstrumentsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Покупка акции")
public class InvestmentsAddInstrumentsPageService extends CommonService {

    @Autowired
    public InvestmentsAddInstrumentsPageService(InvestmentsAddInstrumentsPage page) {
        super(page);
    }

}
