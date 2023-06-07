package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Lifepartner {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://lifepartner.in");

        Thread.sleep(2000);

        WebElement LookingFor = driver.findElement(By.name("bg"));
        Select sel1 = new Select(LookingFor);
        sel1.selectByVisibleText("Bride");

        Thread.sleep(2000);

        WebElement startAge = driver.findElement(By.name("a1"));
        WebElement endAge = driver.findElement(By.name("a2"));
        Select sel2 = new Select(startAge);
        Select sel3 = new Select(endAge);
        sel2.selectByVisibleText("25");
        sel3.selectByVisibleText("35");

        Thread.sleep(2000);

        WebElement community = driver.findElement(By.name("cm"));
        Select sel4 = new Select(community);
        sel4.selectByVisibleText("Hindu:Marathi");

        Thread.sleep(2000);

        WebElement maritalStatus = driver.findElement(By.name("ms"));
        Select sel5 = new Select(maritalStatus);
        sel5.selectByValue("1");

        Thread.sleep(5000);
        driver.close();

    }
}
