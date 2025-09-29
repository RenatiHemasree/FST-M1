package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity3 {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alchemy.hguy.co/lms");
	}

	@Test
	public void verifyFirstInfoBox() {
		String infoTitle = driver
				.findElement(By.xpath(
						"(//h3[@class='uagb-ifb-title'])[1]"))
				.getText();
		Assert.assertEquals(infoTitle, "Actionable Training");
		System.out.println("First info box title verified: " + infoTitle);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
