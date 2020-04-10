package my.antonov.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

/**
 * Интерфейс для все объектов Page
 */
@Slf4j
public abstract class Page {

    protected final String FIELD_NAME = "FIELD_NAME";
    protected List<String> buttonXPaths;
    protected List<String> titleXPaths;
    protected List<String> inputXPaths;
    protected List<String> checkBoxXPaths;

    protected SelenideElement getElementByName(List<String> xPaths, String elementName) {
        for (String xpath : xPaths) {
            String xPathReadyToSearch = xpath.replace(FIELD_NAME, elementName);
            try {
                return $(By.xpath(xPathReadyToSearch));
            } catch (Exception e) {
                log.warn("Element not found by xpath: {}", xPathReadyToSearch);
            }
        }
        throw new IllegalArgumentException("Cannot find elements when the XPath is null.");
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
}
