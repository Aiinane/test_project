package GoogleTest;

import ParentTest.ParantSeledineTest;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;


public class GoogleSelenideTest extends ParantSeledineTest {



    @Test
    public void googleTestTheSelenide(){
        googlePageSelenide.openGooglePageWithSelenide("https://www.google.com/");
        //Selenide.open("https://www.google.com/");

        googlePageSelenide.shouldHaveImg();
        //$(By.xpath(".//img[@alt='Google']")).shouldHave(Condition.visible, Duration.ofSeconds(100));

        googlePageSelenide.inputTextGoogle("maven selenium java");
        //$(By.xpath(".//input[@type='text']")).shouldHave(Condition.visible, Duration.ofSeconds(100)).setValue("maven selenium java");

        googlePageSelenide.buttonSubmitGoogle();
        //$(By.xpath(".//div[5]/center[1]/input[1]")).click();

        googlePageSelenide.url.shouldHave(Condition.href("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java"));
        // $(By.xpath(".//a[@href='https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java']")).shouldHave(Condition.href("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java"));


    }


}
