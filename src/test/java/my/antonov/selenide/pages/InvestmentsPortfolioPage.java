package my.antonov.selenide.pages;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Slf4j
@Component
public class InvestmentsPortfolioPage extends Page {
    {
        buttonXPaths = new ArrayList<>(
                Arrays.asList(
                        "//a[contains(text(),'"+FIELD_NAME+"')]"
                )
        );
    }
}
