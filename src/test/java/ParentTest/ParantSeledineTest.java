package ParentTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.GooglePageSelenide;

import java.util.HashMap;
import java.util.Map;

public class ParantSeledineTest {

    public GooglePageSelenide googlePageSelenide;
//@Before
@Step("Configuration browser")
    @Parameters("browser")
    @BeforeClass
    public void SetUp (){




        Configuration.fastSetValue=true;
        Configuration.browserSize= "1600x1200";
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        //1- Allow, 2-block, 3 - default
        prefs.put("profile.default_content_setting_values.notifications", 1);
        options.setExperimentalOption("prefs",prefs);
        options.addArguments("disable-infobars");
        options.addArguments("--window-size-1600,1200");
        Configuration.screenshots = true;
        Configuration.savePageSource = true;
        Configuration.reopenBrowserOnFail = true;


        WebDriverRunner.setWebDriver(new ChromeDriver(options));


        googlePageSelenide= new GooglePageSelenide();

    }
    //@After

    @AfterClass
    public void tearDown(){

        WebDriver currentDriver = WebDriverRunner.getWebDriver();
        currentDriver.manage().deleteAllCookies();
        currentDriver.quit();



        //webDriver.close();//зачиняє вкладку

    }
}
