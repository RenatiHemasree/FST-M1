package project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class Activity9 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void completeLesson() {
        // a & b. Open browser and navigate
        driver.get("https://alchemy.hguy.co/lms");

        // c & d. Find the navigation bar and click "All Courses"
        WebElement allCourses = driver.findElement(By.linkText("All Courses"));
        allCourses.click();

        // e. Select any course (first course from the list) and open it
        List<WebElement> courses = driver.findElements(By.cssSelector(".ld_course_grid .ld_course"));
        if (!courses.isEmpty()) {
            WebElement firstCourse = courses.get(0).findElement(By.cssSelector("h3.entry-title > a"));
            System.out.println("Opening course: " + firstCourse.getText());
            firstCourse.click();
        } else {
            System.out.println("No courses found!");
        }

        // Print course page title
        System.out.println("Course Page Title: " + driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
