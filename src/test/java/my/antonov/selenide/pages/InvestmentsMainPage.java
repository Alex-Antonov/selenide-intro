package my.antonov.selenide.pages;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InvestmentsMainPage extends Page {
    {
        buttonXPaths.add("//span[contains(text(),'"+FIELD_NAME+"')]/../parent::a");
    }
}
