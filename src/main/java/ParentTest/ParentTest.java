package ParentTest;
//this is page object pattern


import io.qameta.allure.Step;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {

    public WebDriver webDriver;
    public GooglePage googlePage;

    public ParentTest(){

    }
   // @Before
   @Step("Configuration browser")
    @BeforeClass
    public void SetUp (){

       File fileChromeDriver = new File( "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",fileChromeDriver.getAbsolutePath());
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        googlePage = new GooglePage(webDriver);




    }
   // @After
   @Step ("Down current driven and cookies ")
    @AfterClass
    public void TestDown(){
        webDriver.quit();



       // webDriver.close();//зачиняє вкладку

    }


}
