import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moses\\Documents\\chrome-win64");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Find the search input element by its name
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter "Selenium Browser Driver" into the search box
        searchBox.sendKeys("Selenium Browser Driver");

        // Submit the search form
        searchBox.submit();

        // Close the browser
        driver.quit();
    }
}
