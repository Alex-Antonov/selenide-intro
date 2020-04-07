package my.antonov.selenide.steps;

import my.antonov.selenide.service.BaseBCSPageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * StepDef-ы специфичные только для главной страницы
 */
public class BaseBCSPageStepDefs {

    @Autowired
    private BaseBCSPageService baseBCSPageService;

}
