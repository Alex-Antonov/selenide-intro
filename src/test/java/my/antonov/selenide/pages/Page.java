package my.antonov.selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Slf4j
public abstract class Page {

    protected final String FIELD_NAME = "FIELD_NAME";
    protected List<String> buttonXPaths = new ArrayList<>();
    protected List<String> titleXPaths = new ArrayList<>();
    protected List<String> inputXPaths = new ArrayList<>();
    protected List<String> checkBoxXPaths = new ArrayList<>();
    protected List<String> labelXPaths = new ArrayList<>();

    private List<List<String>> xPaths = new ArrayList<>(
            Arrays.asList(
                    buttonXPaths, titleXPaths, inputXPaths, checkBoxXPaths, labelXPaths
            )
    );


    protected SelenideElement getElementByName(List<String> xPaths, String elementName) {
        for (String xpath : xPaths) {
            String xPathReadyToSearch = xpath.replace(FIELD_NAME, elementName);
            try {
                return $(By.xpath(xPathReadyToSearch)).shouldBe(Condition.visible);
            } catch (Throwable e) {
                log.warn("Element not found by xpath: {}", xPathReadyToSearch);
            }
        }
        throw new IllegalArgumentException("Cannot find element");
    }

    public SelenideElement getTitle(String title) {
        return getElementByName(titleXPaths, title);
    }

    public SelenideElement getTextInput(String fieldName) {
        return getElementByName(inputXPaths, fieldName);
    }

    public SelenideElement getButton(String buttonName) {
        return getElementByName(buttonXPaths, buttonName);
    }

    public SelenideElement getCheckBox(String checkBoxName) {
        return getElementByName(checkBoxXPaths, checkBoxName);
    }

    public SelenideElement getLabel(String label) {
        return getElementByName(labelXPaths, label);
    }

    public SelenideElement getElementByName(String fieldName) {
        for (List<String> xPathsList : xPaths) {
            try {
                return getElementByName(xPathsList, fieldName);
            } catch (Exception e) {
                log.warn("Element not found by name: {}", fieldName);
            }
        }
        throw new IllegalArgumentException("Cannot find element");
    }

    public SelenideElement getElementByText(String text) {
        return $(byText(text));
    }
}
