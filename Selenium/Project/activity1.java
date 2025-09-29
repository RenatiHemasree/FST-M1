package project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class activity1 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifyTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
        System.out.println("Website title verified: " + title);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
