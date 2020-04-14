package my.antonov.selenide.pages.dialogs;

import my.antonov.selenide.pages.Page;
import org.springframework.stereotype.Component;

@Component
public class AuthorizationDialog extends Page {

    {
        buttonXPaths.add("//button[contains(text(),'" + FIELD_NAME + "')]");

        titleXPaths.add("//div[contains(text(),'" + FIELD_NAME + "')]");

        inputXPaths.add("//span[contains(text(),'" + FIELD_NAME + "')]/following-sibling::input");
        inputXPaths.add("//input[@placeholder='"+ FIELD_NAME +"']");

        checkBoxXPaths.add("//span[contains(text(), '" + FIELD_NAME + "')]/preceding-sibling::input[@type='checkbox']");
    }
}
