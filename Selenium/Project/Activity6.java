package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import java.time.Duration;

public class Activity6 {

	WebDriver driver;
	String username = "your_username";
	String password = "your_password";

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void loginTest() throws InterruptedException {
		driver.get("https://alchemy.hguy.co/lms");

		// Navigate to My Account
		WebElement myAccount = driver.findElement(By.linkText("My Account"));
		myAccount.click();

		// Verify page title
		String title = driver.getTitle();
		if (title.contains("My Account")) {
			System.out.println("On My Account page.");
		} else {
			System.out.println("Failed to reach My Account page.");
		}

		// Click Login if necessary
		try {
			WebElement loginButton = driver.findElement(By.linkText("Login"));
			loginButton.click();
		} catch (Exception e) {
			// Already on login form
		}

		// Enter credentials
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);

		// Click Login
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);

		// Verify login
		if (driver.getPageSource().contains("Logout")) {
			System.out.println("Login successful.");
		} else {
			System.out.println("Login failed.");
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
