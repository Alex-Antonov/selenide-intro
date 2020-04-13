package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsMainPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Главная страница")
public class InvestmentsMainPageService extends CommonService {

    @Autowired
    public InvestmentsMainPageService(InvestmentsMainPage page) {
        super(page);
    }

}
