package BasicMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginDemo2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento2-demo.magebit.com/admin");
        // Login credentials:
        // Username: magebit
        // Password: Demo123

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement txtUserName = driver.findElement(By.id("username"));
        txtUserName.sendKeys("magebit");

        WebElement txtPassword = driver.findElement(By.id("login"));
        txtPassword.sendKeys("Demo123");

        WebElement btnLogin = driver.findElement(By.tagName("button"));
        btnLogin.click();




        driver.close();
    }
}
