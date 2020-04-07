package my.antonov.selenide.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import my.antonov.selenide.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import static com.codeborne.selenide.Selenide.switchTo;

public class CommonStepDefinition {

    @Autowired
    private ApplicationContext context;
    private CommonService commonService;

    @Дано("пользователь зашел на страницу {string}")
    public void changePageService(String pageName) {
        commonService = (CommonService) context.getBean(pageName);
    }

    @Тогда("пользователь на странице видит заголовок {string}")
    public void checkTitle(String title) {
        commonService.checkTitle(title);
    }

    @Тогда("пользователь переходит на вкдадку {int}")
    public void swithcTab(int tabIndex) {
        switchTo().window(tabIndex);
    }

    @Когда("пользователь нажимает на кнопку {string}")
    public void clickButton(String buttonName) {
        commonService.clickButton(buttonName);
    }

    @Пусть("пользователь заполняет поле {string} значением {string}")
    public void inputText(String fieldName, String text) {
        commonService.fillInputText(fieldName, text);
    }

}
