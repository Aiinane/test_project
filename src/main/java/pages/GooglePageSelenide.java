package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.log4j.Logger;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class GooglePageSelenide {
    private final Logger logger = Logger.getLogger(getClass());

    public SelenideElement
            imgGoogle = $x(".//img[@alt='Google']"),
            inputTes = $x(".//input[@type='text']"),
            buttonSubmitGoogle = $x(".//div[5]/center[1]/input[1]"),
            url = $x (".//a[@href='https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java']");

    //for Seledine-->

    @Step("Configuration browser {url}")

    public void openGooglePageWithSelenide(String url) {
        // open(url);
        Selenide.open(url);
        logger.info("Was opened "+url);
    }
    @Step
    public void shouldHaveImg(){
        imgGoogle.shouldHave(Condition.visible);
        logger.info("Element should condition - VISIBLE");

    }
    @Step("Input text for google page {text}")
    public void inputTextGoogle(String text){

        inputTes.setValue(text);
        logger.info("Text inputted ");
    }
    @Step
    public void buttonSubmitGoogle(){

        buttonSubmitGoogle.shouldHave(Condition.visible, Duration.ofSeconds(100)).click();

    }
}
