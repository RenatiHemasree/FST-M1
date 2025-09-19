package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        // Create a driver object
        WebDriver driver = new FirefoxDriver(); // ChromeDriver() or EdgeDriver()

        // Open the page
        driver.get("https://training-support.net");
        driver.manage().window().maximize();

        // Verify using the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Locate and click the About Us link
        driver.findElement(By.linkText("About Us")).click();
        System.out.println("New page title is: " + driver.getTitle());

        // Print the title of the About Us page

        // Close the browser
        driver.quit();
    }
}