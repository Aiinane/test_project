package BDD.StepDefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
    @Given("^Open the Chrome and launch the Application$")
    public void open_the_Chrome_and_launch_the_Application() throws Throwable {
        System.out.println("This step open the chrome and launch the application");
        throw new PendingException();
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable {
        System.out.println("This step enter the username and password");
        throw new PendingException();
    }

    @Then("^Click button submit$")
    public void click_button_submit() throws Throwable {
        System.out.println("This step Click button submit");
        throw new PendingException();
    }


}
