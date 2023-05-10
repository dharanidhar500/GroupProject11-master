package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy(xpath = "//a[@aria-label='Search and explore']")
    WebElement explore;
    @FindBy(xpath = "//input[@placeholder='Search Twitter']")
    WebElement entertext;

    @FindBy(className = "css-901oao")
    WebElement person;


    public void ExplorePage() throws InterruptedException{
        explore.click();
        Thread.sleep(2000);
        entertext.sendKeys("dhoni");
        Thread.sleep(2000);
        person.click();
        Thread.sleep(4000);


    }
}
