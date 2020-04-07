package my.antonov.selenide.service;

import my.antonov.selenide.pages.BaseBCSPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервис для главной страницы,
 * где нужно реализовывать все
 * кейсы только для главной страницы
 */
@Service("Главная страница")
public class BaseBCSPageService extends CommonService {

    @Autowired
    private BaseBCSPage baseBCSPage;

    @Override
    public void checkTitle(String title) {
        isElementDisplayed(baseBCSPage.getTitle(title));
    }

    @Override
    public void clickButton(String buttonName) {
        clickButton(baseBCSPage.getButton(buttonName));
    }

    @Override
    public void fillInputText(String fieldName, String text) {

    }
}
