package main.java.pageEvents;
import main.java.pageObjects.HomePageObjects;
import main.java.utils.ElementFetch;

public class HomePageEvents {
    public void clickOnSignInButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageObjects.signInButton).click();
    }

}
