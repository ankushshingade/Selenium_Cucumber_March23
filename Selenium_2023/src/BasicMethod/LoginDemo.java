package BasicMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

/*
        String username = "tomsmith";
        String password = "SuperSecretPassword!";

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
*/
        WebElement UserName = driver.findElement(By.id("username"));
        UserName.sendKeys("tomsmith");

        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("SuperSecretPassword!");

        WebElement LoginButton = driver.findElement(By.className("radius"));
        LoginButton.click();

        Thread.sleep(3000);

        driver.close();
    }
}
