package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity5 {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://alchemy.hguy.co/lms");
        System.out.println("Opened Alchemy LMS home page.");
    }

    @Test
    public void navigateToMyAccountAndVerify() {
        // Click My Account in the top navigation
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Account"))).click();
        System.out.println("Clicked My Account link.");

        // Wait and verify the title indicates correct page
        wait.until(ExpectedConditions.titleContains("My Account")); // explicit wait for title [web:69][web:70][web:74]
        String title = driver.getTitle(); // get the page title [web:48][web:51]
        Assert.assertTrue(title.contains("My Account"), "Page title did not indicate My Account page."); // assert contains [web:50][web:49]
        System.out.println("Verified page title: " + title);

        // Optional: verify URL pattern
        String url = driver.getCurrentUrl(); // get current URL [web:51]
        Assert.assertTrue(url.toLowerCase().contains("my-account"), "URL does not indicate My Account page."); // URL contains check [web:61]
        System.out.println("Verified page URL: " + url);

        // Optional sanity: presence of page-specific content
        boolean hasAccountKeywords = driver.getPageSource().toLowerCase().contains("login")
                                  || driver.getPageSource().toLowerCase().contains("dashboard");
        Assert.assertTrue(hasAccountKeywords, "Expected My Account page content not found."); // additional assert [web:50]
        System.out.println("Verified My Account page content is present.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
