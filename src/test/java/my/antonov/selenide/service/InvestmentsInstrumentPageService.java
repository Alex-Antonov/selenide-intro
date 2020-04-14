package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsAddInstrumentsPage;
import my.antonov.selenide.pages.InvestmentsInstrumentPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Страница инструмента")
public class InvestmentsInstrumentPageService extends CommonService {

    @Autowired
    public InvestmentsInstrumentPageService(InvestmentsInstrumentPage page) {
        super(page);
    }

}
