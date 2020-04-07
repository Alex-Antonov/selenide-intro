package my.antonov.selenide.pages;

import com.codeborne.selenide.SelenideElement;

/**
 * Интерфейс для все объектов Page
 */
public interface Page {
    SelenideElement getTitle(String title);
    SelenideElement getTextInput(String fieldName);
    SelenideElement getButton(String buttonName);
}
