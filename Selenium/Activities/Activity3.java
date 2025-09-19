package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/login-form");

        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the username field and type in the username
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");

        // Find the password field and type in the password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");

        // Find the Submit button and click it
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        // Get the success message and print it
        String message = driver.findElement(By.xpath("//h2[contains(@class, 'text-gray-800')]")).getText();
        System.out.println(message);
        // Close the browser
        driver.quit();
    }
}