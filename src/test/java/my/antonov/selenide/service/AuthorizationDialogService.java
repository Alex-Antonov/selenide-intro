package my.antonov.selenide.service;

import my.antonov.selenide.pages.dialogs.AuthorizationDialog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Авторизация")
public class AuthorizationDialogService  extends CommonService {

    @Autowired
    private AuthorizationDialog authorizationDialog;

    @Override
    public void checkTitle(String title) {
        isElementDisplayed(authorizationDialog.getTitle(title));
    }

    @Override
    public void clickButton(String buttonName) {
        clickButton(authorizationDialog.getButton(buttonName));
    }

    @Override
    public void fillInputText(String fieldName, String text) {
        inputText(authorizationDialog.getTextInput(fieldName), text);
    }

    @Override
    public void setCheckBox(String checkBoxName, boolean value) {
        setCheckBox(authorizationDialog.getCheckBox(checkBoxName), value);
    }
}
