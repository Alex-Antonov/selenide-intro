package my.antonov.selenide.service;

import my.antonov.selenide.pages.InvestmentsPreviewPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Превью")
public class InvestmentsPreviewPageService extends CommonService {

    @Autowired
    public InvestmentsPreviewPageService(InvestmentsPreviewPage page) {
        super(page);
    }

}
