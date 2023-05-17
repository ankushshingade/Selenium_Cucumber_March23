import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // Upcasting, WebDriver is parent class (here it is interface).
        // Methods are defined in WebDriver and are overridden by chromedriver methods.

        //driver.manage().window().maximize();
        driver.get("http://facebook.com");

        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://gmail.com");

        Thread.sleep(2000);

        driver.close(); // Closes the current window
        //driver.quit(); // Closes all the windows opened by driver

    }
}
