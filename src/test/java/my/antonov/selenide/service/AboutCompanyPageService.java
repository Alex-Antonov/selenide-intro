package my.antonov.selenide.service;

import my.antonov.selenide.pages.AboutCompanyPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервис для главной страницы,
 * где нужно реализовывать все
 * кейсы только для страницы О компании
 */
@Service("О компании")
public class AboutCompanyPageService extends CommonService {

    @Autowired
    private AboutCompanyPage aboutCompanyPage;

    @Override
    public void checkTitle(String title) {
        isElementDisplayed(aboutCompanyPage.getTitle(title));
    }

    @Override
    public void clickButton(String buttonName) {

    }

    @Override
    public void fillInputText(String fieldName, String text) {

    }
}
