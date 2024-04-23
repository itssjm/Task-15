import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebDriverScript {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moses\\Documents\\chrome-win64\\Chrome.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open a website
        driver.get("https://www.example.com");

        // Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Close the browser
        driver.quit();
    }
}
