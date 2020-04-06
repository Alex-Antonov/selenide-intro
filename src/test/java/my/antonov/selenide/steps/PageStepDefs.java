/**
 * Базовый StepDef для всех остальных
 * Перед выполнением каждого сценария
 * будет производится автоматический
 * переход на главную страницу
 * В конце каждого сценария чистит
 * кэш браузера
 */
package my.antonov.selenide.steps;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import my.antonov.selenide.config.PropertiesConfig;
import my.antonov.selenide.config.WebdriverBeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.Selenide.open;

@ContextConfiguration(classes = {WebdriverBeanConfig.class})
public class PageStepDefs {

    @Autowired
    private PropertiesConfig config;

    public PageStepDefs() {

    }

    @Before
    public void before() {
        open(config.getUrl());
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @After
    public void after() {
        WebDriverRunner.clearBrowserCache();
    }
}
