package my.antonov.selenide.service;

import my.antonov.selenide.pages.dialogs.AuthorizationDialog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Авторизация")
public class AuthorizationDialogService  extends CommonService {

    @Autowired
    public AuthorizationDialogService(AuthorizationDialog page) {
        super(page);
    }

}
