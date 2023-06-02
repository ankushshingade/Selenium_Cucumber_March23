package BasicMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // Upcasting, WebDriver is parent class (here it is interface).
        // Methods are defined in WebDriver and are overridden by chromedriver methods.

        driver.manage().window().maximize();
        driver.get("http://facebook.com");

        Thread.sleep(2000);

        driver.navigate().to("http://gmail.com");

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().refresh();





    }
}
