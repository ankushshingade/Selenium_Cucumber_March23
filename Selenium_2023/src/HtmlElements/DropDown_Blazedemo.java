package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Blazedemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com");

        Thread.sleep(5000);

        // Find dropdown element
        WebElement selTxt = driver.findElement(By.name("fromPort"));

        // Create the object of Select class
        Select sel = new Select(selTxt);

        // Select from dropdown
        sel.selectByValue("Mexico City");

        Thread.sleep(5000);

        WebElement selTxt2 = driver.findElement(By.name("toPort"));

        Select sel2 = new Select(selTxt2);

        sel2.selectByValue("London");

        Thread.sleep(5000);
        driver.close();
    }
}
