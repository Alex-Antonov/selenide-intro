package my.antonov.selenide.steps;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import my.antonov.selenide.config.PropertiesConfig;
import my.antonov.selenide.config.WebdriverBeanConfig;
import my.antonov.selenide.utils.TestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.Selenide.open;

@ContextConfiguration(classes = {WebdriverBeanConfig.class})
public class PageStepDefs {

    @Autowired
    private PropertiesConfig config;

    @Autowired
    private TestContext testContext;

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
        testContext.cleanContext();
    }
}
