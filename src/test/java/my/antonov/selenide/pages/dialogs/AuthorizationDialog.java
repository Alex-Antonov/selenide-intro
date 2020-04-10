package my.antonov.selenide.pages.dialogs;

import my.antonov.selenide.pages.Page;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class AuthorizationDialog extends Page {

    {
        buttonXPaths = new ArrayList<>(
                Arrays.asList(
                        "//button[contains(text(),'" + FIELD_NAME + "')]"
                )
        );

        titleXPaths = new ArrayList<>(
                Arrays.asList(
                        "//div[contains(text(),'" + FIELD_NAME + "')]"
                )
        );

        inputXPaths = new ArrayList<>(
                Arrays.asList(
                        "//span[contains(text(),'" + FIELD_NAME + "')]/following-sibling::input"
                )
        );

        checkBoxXPaths = new ArrayList<>(
                Arrays.asList(
                        "//span[contains(text(), '" + FIELD_NAME + "')]/preceding-sibling::input[@type='checkbox']"
                )
        );
    }
}
