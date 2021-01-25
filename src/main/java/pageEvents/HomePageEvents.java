package main.java.pageEvents;
import main.java.pageObjects.HomePageObjects;
import main.java.utils.ElementFetch;
import org.testng.Assert;

public class HomePageEvents {
    public void amazonHomeScreenValidation() throws Exception{
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageObjects.signInButton).click();
        Assert.assertTrue(elementFetch.getWebElement("XPATH", HomePageObjects.signInButton).isDisplayed(),"SignIn button should be present.");
    }
    public void clickOnSignInButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageObjects.signInButton).click();
    }

}
