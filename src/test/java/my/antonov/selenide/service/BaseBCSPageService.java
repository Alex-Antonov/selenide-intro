/**
 * Сервис для главной страницы,
 * где нужно реализовывать все
 * кейсы только для главной страницы
 */
package my.antonov.selenide.service;

import my.antonov.selenide.pages.BaseBCSPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseBCSPageService extends CommonService {

    @Autowired
    private BaseBCSPage baseBCSPage;

    public void checkTitle(String title) {
        isElementDisplayed(baseBCSPage, BaseBCSPage.BaseBCSPageElements.HEADER_TITLE);
    }
}
