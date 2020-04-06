/**
 * Присоска ко всем StepDef-ам
 * В конце каждого сценария проверяет
 * статус прохождения тестов
 * При негативном статусе делает скриншот,
 * который будет прикреплен к отчету
 */
package my.antonov.selenide.steps;

import com.codeborne.selenide.Screenshots;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.qameta.allure.Allure;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ScreenShotMaker {
    @After
    public void onTestFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                File screenshot = Screenshots.takeScreenShotAsFile();
                InputStream targetStream = new FileInputStream(screenshot);
                Allure.addAttachment("Screenshot on fail", "image/png", targetStream, "png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
