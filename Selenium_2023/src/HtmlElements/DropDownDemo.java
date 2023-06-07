package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/Ankush/OneDrive/Desktop/Selenium_Cucumber_March23/amol.html");

        // 1. Find the element of drop down
        WebElement selText = driver.findElement(By.id("seltext"));

        // 2. Create the object of Select class
        Select sel = new Select(selText);

        Thread.sleep(5000);
        // 3. Select from dropdown
        sel.selectByVisibleText("text 3");

        Thread.sleep(5000);

        sel.selectByIndex(4);

        Thread.sleep(5000);

        sel.selectByValue("v2");

        Thread.sleep(5000);

        driver.close();
    }
}
