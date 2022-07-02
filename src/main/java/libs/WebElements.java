package libs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElements {
    WebDriver webDriver;
    Logger logger;
    public WebElements (WebDriver webDriver) {
    this.webDriver = webDriver;
        logger = LogManager.getLogger(getClass());

    }
    public void enterText(WebElement element, String text){
        try {
            element.clear();
            element.sendKeys(text);
            logger.info(text + " was inputted");

        }
        catch (Exception e){

            logger.error("Can't work with element " + element);
            Assert.fail("Can't work with element " + element);
        }

    }
    public void clickOnElement (WebElement element){
    try {
        element.click();
        logger.info("element was clicked");
    }
    catch (Exception e){
        logger.error("element not clicked"+ element);
        Assert.fail("element not clicked"+ element);
    }

    }
    public boolean isElementPresent (String locator){
        try {
            return webDriver.findElement( By.xpath(locator)).isDisplayed();
        }
        catch (Exception e){

            return false;
        }
    }
}
