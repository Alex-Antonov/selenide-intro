/**
 * StepDef реализация без паттерна PageObject
 * Будет удалено в следующих коммитах
 * TODO remove this fucking sheet
 */
package my.antonov.selenide.steps;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Также;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchStepDefinitionsTest {

    @Допустим("пользователь заходит на сайт google.com")
    public void openGoogleSearch() {
        Configuration.reportsFolder = "build/surefire-reports";
        open("https://google.com/ncr");
    }

    @Когда("он пишет в поиске слово {string}")
    public void enterKeyword(String keyword) {
        $(By.name("q")).val(keyword).pressEnter();
    }

    @Тогда("хотя бы {int} результат будет отображен")
    public void topTenMatchesShouldBeShown(int resultsCount) {
        $$("#res .g").shouldHave(sizeGreaterThanOrEqual(resultsCount));
    }

    @Также("первый результат должен содержать текст {string}")
    public void theFirstOneShouldContainKeyword(String expectedText) {
        $("#res .g").shouldHave(text(expectedText));
    }
}
