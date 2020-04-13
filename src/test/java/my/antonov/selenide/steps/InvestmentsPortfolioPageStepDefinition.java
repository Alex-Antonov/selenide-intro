package my.antonov.selenide.steps;

import cucumber.api.java.ru.Тогда;
import lombok.extern.slf4j.Slf4j;
import my.antonov.selenide.service.InvestmentsPortfolioPageService;
import my.antonov.selenide.utils.TestContext;
import my.antonov.selenide.utils.TestUtils;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class InvestmentsPortfolioPageStepDefinition {

    @Autowired
    private InvestmentsPortfolioPageService investmentsPortfolioPageService;

    @Autowired
    private TestContext testContext;

    @Тогда("пользователь проверяет, что в поле {string} содержится сумма значений {string} и {string}")
    public void checkTotalSumAtField(String fieldName, String firstKey, String secondKey) {
        float firstValue = TestUtils.trimFreeMoneyValue((String)testContext.getContext(firstKey));
        float secondValue = TestUtils.trimFreeMoneyValue((String)testContext.getContext(secondKey));

        float total = TestUtils.trimFreeMoneyValue(investmentsPortfolioPageService.getTextFromElement(fieldName));

        log.info("Assert that {} = {} + {}", total, firstValue, secondValue);
        assertThat(total == (firstValue + secondValue));
    }
}
