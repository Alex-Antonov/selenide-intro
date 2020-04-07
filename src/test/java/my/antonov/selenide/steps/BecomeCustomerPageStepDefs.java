package my.antonov.selenide.steps;

import my.antonov.selenide.service.BecomeCustomerPageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * StepDef-ы специфичные только для страницы Стать клиентом
 */
public class BecomeCustomerPageStepDefs {

    @Autowired
    private BecomeCustomerPageService becomeCustomerPageService;

}
