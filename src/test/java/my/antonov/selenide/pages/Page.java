/**
 * Интерфейс для все объектов Page
 * Возвращает мапу елементов на странице
 */
package my.antonov.selenide.pages;

import com.codeborne.selenide.SelenideElement;

import java.util.Map;

public interface Page {
    Map<Element, SelenideElement> getElements();
}
