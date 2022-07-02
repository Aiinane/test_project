package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends ParentPage {
    public GooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (xpath = ".//input[@type='text']")
    private WebElement inputText;

    @FindBy (xpath = ".//div[5]/center[1]/input[1]")
    private WebElement buttonSubmit;





@Step("Open google page")
    public void openGoogle(){
        open("https://www.google.com/");

    }
@Step("Input text for google page {text}")
    public void enterTextforG (String text){
        webElements.enterText(inputText, text );
    }

    @Step("Click button submit")
    public void clickOnSubmit(){

        webElements.clickOnElement(buttonSubmit);


    }




}
