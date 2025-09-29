package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifySecondMostPopularCourseTitle() {
        // Step a & b: Open browser and navigate
        driver.get("https://alchemy.hguy.co/lms");

        // Step c: Locate the second most popular course title
        WebElement secondCourse = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]"));
        String actualTitle = secondCourse.getText();

        // Expected text
        String expectedTitle = "Email Marketing Strategies";

        // Print retrieved course title
        System.out.println("Second Most Popular Course Title is: " + actualTitle);

        // Step d: Verify the course title text
        Assert.assertEquals(actualTitle, expectedTitle, "Second most popular course title does not match!");
        System.out.println("Course title verified successfully! It matches: " + expectedTitle);
    }

    @AfterClass
    public void tearDown() {
        // Step e: Close browser
        driver.quit();
    }
}
