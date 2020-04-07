package my.antonov.selenide.service;

import my.antonov.selenide.pages.BecomeCustomerPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервис для Стать клиентом страницы,
 * где нужно реализовывать все
 * кейсы только для главной страницы
 */
@Service("Стать клиентом")
public class BecomeCustomerPageService extends CommonService {

    @Autowired
    private BecomeCustomerPage becomeCustomerPage;

    @Override
    public void checkTitle(String title) {
        isElementDisplayed(becomeCustomerPage.getTitle(title));
    }

    @Override
    public void clickButton(String buttonName) {
        clickButton(becomeCustomerPage.getButton(buttonName));
    }

    @Override
    public void fillInputText(String fieldName, String text) {
        inputText(becomeCustomerPage.getTextInput(fieldName), text);
    }
}
