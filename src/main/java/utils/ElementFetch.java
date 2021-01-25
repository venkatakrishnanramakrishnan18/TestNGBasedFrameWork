package main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.java.BaseTest;

import java.util.List;

public class ElementFetch {
    public WebElement getWebElement(String identifierType,String indentifierValue){
        switch(identifierType){
            case"ID":
                return BaseTest.driver.findElement(By.id(indentifierValue));
            case"CSS":
                return BaseTest.driver.findElement(By.cssSelector(indentifierValue));
            default:
                return null;
        }
    }

    public List<WebElement> getListWebElements(String identifierType, String indentifierValue){
        switch(identifierType){
            case"ID":
                return BaseTest.driver.findElements(By.id(indentifierValue));
            case"CSS":
                return BaseTest.driver.findElements(By.cssSelector(indentifierValue));
            case"XPATH":
                return BaseTest.driver.findElements(By.xpath(indentifierValue));
            default:
                return null;
        }
    }
}
