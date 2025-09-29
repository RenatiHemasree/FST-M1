package project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifyHeading() {
        String heading = driver.findElement(By.cssSelector("h1.uagb-ifb-title")).getText();
        Assert.assertEquals(heading, "Learn from Industry Experts");
        System.out.println("Website heading verified: " + heading);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
