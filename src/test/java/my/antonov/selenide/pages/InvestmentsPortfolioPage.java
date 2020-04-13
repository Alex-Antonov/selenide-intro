package my.antonov.selenide.pages;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InvestmentsPortfolioPage extends Page {
    {
        buttonXPaths.add("//a[contains(text(),'" + FIELD_NAME + "')]");

        labelXPaths.add("(//div[contains(text(),'" + FIELD_NAME + "')]/following-sibling::div)[2]");
    }
}
