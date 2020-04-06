# selenide-intro
Selenide+Cucumber+Allure Reporting project for auto tests

Для прогона автотестов и формирования отчета выполнить в терминале:
gradle clean build
gradle allureReport

Если используется wrapper:
gradlew clean build
gradlew allureReport


my.antonov.selenide.pages - PageObject
my.antonov.selenide.service - Сервисы реализующие логику assert-ов
my.antonov.selenide.steps - StepDefinition-ы - описание отдельных шагов тестовых сценариев