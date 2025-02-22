package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends Base
{
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }
    @And("^user enters username (.*)$")
    public void userEntersUsernameUser_name(String username) {
        loginPage.enterUserName(username);
    }
    @And("^user enters password (.*)$")
    public void userEntersPasswordPassword(String password) {
        loginPage.enterPassWord(password);
    }
    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        loginPage.clickLoginButton();
        snapShot.TakeSnapShot(driver,"Smo");
    }
}
