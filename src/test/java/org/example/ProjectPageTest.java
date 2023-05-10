package org.example;

import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProjectPageTest {
    WebDriver driver = FactoryBrowser.SetupBrowser("chrome", "https://www.twitter.com/");

    @Test(priority = 1)
    public void LoginVerification() throws InterruptedException {
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        login.loginWebsite("Surajh42272","Surajh33##");
        login.loginWebsiteagain("Ramkuma82374175", "Ram12345@");


    }

    @Test(priority = 2)
    public void SearchInfo() throws InterruptedException {
        SearchPage s1 = PageFactory.initElements(driver, SearchPage.class);
        s1.ExplorePage();
    }

    @Test(priority = 3)
    public void Follow() throws InterruptedException {
        FollowPage s1 = PageFactory.initElements(driver, FollowPage.class);
        s1.FollowMethod();

    }
    @Test(priority = 4)
    public void TweetOpen() throws InterruptedException {
        TweetPage p1 = PageFactory.initElements(driver, TweetPage.class);
        p1.TweetMethod();

    }
    @Test(priority = 5)
    public void CommentTheTweet() throws InterruptedException {
        CommentPage p2 = PageFactory.initElements(driver, CommentPage.class);
        p2.TweetVerification();

    }

    @Test(priority = 6)
    public void ProfileTweet() throws InterruptedException {
        ProfilePage p2 = PageFactory.initElements(driver, ProfilePage.class);
        p2.ProfileMethod();

    }
    @Test(priority = 7)
    public void Notification() throws InterruptedException {
        NotificationPage p2 = PageFactory.initElements(driver, NotificationPage.class);
        p2.Notify();

    }
    @Test(priority = 8)
    public void Logout() throws InterruptedException {
        LogoutPage p2 = PageFactory.initElements(driver, LogoutPage.class);
        p2.FinalPage();
    }
}

