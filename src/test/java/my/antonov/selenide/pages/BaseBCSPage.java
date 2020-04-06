/**
 * PageObject главной страницы
 * с описанием некоторых ее веб-элементов
 */
package my.antonov.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static my.antonov.selenide.pages.BaseBCSPage.BaseBCSPageElements.*;

@Getter
@Component
public class BaseBCSPage implements Page {

    /**
     * Перечисление элементов
     */
    public enum BaseBCSPageElements implements Element {
        NAVIGATION_LIST,
        ABOUT,
        MANAGEMENT,
        RATINGS,
        CAREER,
        HEADER_TITLE
    }

    /**
     * Инициализация элементов страницы
     */
    private final Map<Element, SelenideElement> elements = new HashMap<Element, SelenideElement>() {{
        put(NAVIGATION_LIST, $(By.xpath("//div/ul[@class='list nav__list']")));
        put(ABOUT, $(By.linkText("О компании")));
        put(MANAGEMENT, $(By.linkText("Руководство")));
        put(RATINGS, $(By.linkText("Рейтинг и награды")));
        put(CAREER, $(By.linkText("Карьера в БКС")));
        put(HEADER_TITLE, $(By.xpath("//h1[text()='БКС — это Мир инвестиций']")));
    }};
}
