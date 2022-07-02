package selenoidTest;


public class SelenoidTest {
    /* public GooglePageSelenide googlePageSelenide;
    @BeforeTest
    public void setUp(){
        String RUN_TYPE = "remote";
        switch (RUN_TYPE){
        case ("lokal"):

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



        break;
            case ("remote"):
                Configuration.remote = "http://localhost:4444/wd/hub/";
                Configuration.browserSize= "1920x1080";
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName","chrome");
                capabilities.setCapability("browserVersion","101.0");
                capabilities.setCapability("platform","LINUX");
                capabilities.setCapability("enableVNC", true);
                capabilities.setCapability("enableVideo",true);
                capabilities.setCapability("enableLog",true);
                Configuration.browserCapabilities = capabilities;

                break;
        }
        googlePageSelenide= new GooglePageSelenide();


    }

@Test
    public void googleRemoteTest() throws InterruptedException {
        googlePageSelenide.openGooglePageWithSelenide("https://www.google.com/");
        googlePageSelenide.shouldHaveImg();
        googlePageSelenide.inputTextGoogle("maven selenium java");
        googlePageSelenide.buttonSubmitGoogle();
      //  googlePageSelenide.url.shouldHave(Condition.href(".//a[@href='https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java']"));
        Thread.sleep(100000);
}

@Test
    public void stackOverflowTest() throws InterruptedException {
        open("https://stackoverflow.com/");
    Thread.sleep(100000);
}*/



}

