package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class Activity8 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void contactAdmin() throws InterruptedException {
        // a & b. Open browser and navigate
        driver.get("https://alchemy.hguy.co/lms");

        // c & d. Find the navigation bar and click "Contact"
        WebElement contactLink = driver.findElement(By.linkText("Contact"));
        contactLink.click();

        // e. Find the contact form fields and fill them
        WebElement fullName = driver.findElement(By.id("wpforms-8-field_0"));
        WebElement email = driver.findElement(By.id("wpforms-8-field_1"));
        WebElement subject = driver.findElement(By.id("wpforms-8-field_3"));
        WebElement message = driver.findElement(By.id("wpforms-8-field_2"));

        fullName.sendKeys("Test User");
        email.sendKeys("testuser@example.com");
        subject.sendKeys("Test Subject");
        message.sendKeys("This is a test message submitted via Selenium + TestNG automation.");

        // f & g. Click submit
        driver.findElement(By.id("wpforms-submit-8")).click();

        // h. Read and print confirmation message
        Thread.sleep(3000); // wait for message
        WebElement confirmation = driver.findElement(By.id("wpforms-confirmation-8"));
        System.out.println("Form submitted successfully. Message: " + confirmation.getText());
    }

    @AfterClass
    public void tearDown() {
        // i. Close the browser
        driver.quit();
    }
}
