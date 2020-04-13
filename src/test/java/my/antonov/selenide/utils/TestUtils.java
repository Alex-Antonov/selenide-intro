package my.antonov.selenide.utils;

public class TestUtils {

    private TestUtils() {

    }

    public static float trimFreeMoneyValue(String value) {
        return Float.parseFloat(value
                .replace("\nруб.", "")
                .replace(",", ".")
                .trim().replaceAll("\\s", ""));
    }
}
