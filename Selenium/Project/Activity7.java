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

public class Activity7 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void countCourses() {
        // a & b. Open browser and navigate
        driver.get("https://alchemy.hguy.co/lms");

        // c & d. Find the navigation bar and click "All Courses"
        WebElement allCourses = driver.findElement(By.linkText("All Courses"));
        allCourses.click();

        // e. Find all the courses on the page
        List<WebElement> courses = driver.findElements(By.cssSelector(".ld_course_grid .ld_course"));

        // f. Print the number of courses
        System.out.println("Number of courses on the page: " + courses.size());

        // (Optional) Print course titles
        for (WebElement course : courses) {
            String courseTitle = course.findElement(By.cssSelector("h3.entry-title")).getText();
            System.out.println("Course: " + courseTitle);
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
