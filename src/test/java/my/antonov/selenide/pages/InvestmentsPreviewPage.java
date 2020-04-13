package my.antonov.selenide.pages;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InvestmentsPreviewPage extends Page {

    {
        buttonXPaths.add("//a[contains(text(),'" + FIELD_NAME + "')]");

        titleXPaths.add("//h1[contains(text(),'" + FIELD_NAME + "')]");
    }

}
