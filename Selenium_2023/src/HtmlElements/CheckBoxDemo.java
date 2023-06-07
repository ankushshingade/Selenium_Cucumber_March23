package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBoxDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/Ankush/OneDrive/Desktop/Selenium_Cucumber_March23/amol.html");

        WebElement java = driver.findElement(By.id("check0"));
        WebElement selenium = driver.findElement(By.id("check1"));
        WebElement Cucumber = driver.findElement(By.id("check2"));

        Thread.sleep(2000);

        if(java.isSelected())
            java.click();

        //Thread.sleep(2000);

        if(selenium.isSelected())
            selenium.click();

        //Thread.sleep(2000);

        if(Cucumber.isSelected())
            Cucumber.click();

        //Thread.sleep(2000);

        //driver.close();
    }
}
