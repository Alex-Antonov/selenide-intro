package my.antonov.selenide.pages;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InvestmentsPortfolioPage extends Page {
    {
        buttonXPaths.add("//a[contains(text(),'" + FIELD_NAME + "')]");
        buttonXPaths.add("(//span[contains(text(),'" + FIELD_NAME + "')]/parent::a)[1]");

        labelXPaths.add("(//div[contains(text(),'" + FIELD_NAME + "')]/following-sibling::div)[2]");

        buttonOnElementXPaths.add("//a[contains(text(),'" + ELEMENT_NAME + "')]/ancestor::tr/descendant::span[contains(text(), '" + FIELD_NAME + "')]/ancestor::a");
    }
}
