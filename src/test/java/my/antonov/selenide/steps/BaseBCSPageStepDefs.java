/**
 * StepDef-ы для главной страницы
 */
package my.antonov.selenide.steps;

import cucumber.api.java.ru.Дано;
import my.antonov.selenide.service.BaseBCSPageService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseBCSPageStepDefs {

    @Autowired
    private BaseBCSPageService baseBCSPageService;

    @Дано("пользователь на главной странице, видит заголовок {string}")
    public void checkTitle(String title) {
        baseBCSPageService.checkTitle(title);
    }
}
