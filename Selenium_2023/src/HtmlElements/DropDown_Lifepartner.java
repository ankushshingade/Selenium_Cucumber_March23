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

        WebElement selTxt1 = driver.findElement(By.name("bg"));
        Select sel1 = new Select(selTxt1);
        sel1.selectByVisibleText("Bride");

        Thread.sleep(2000);

        WebElement selTxt2 = driver.findElement(By.name("a1"));
        WebElement selTxt3 = driver.findElement(By.name("a2"));
        Select sel2 = new Select(selTxt2);
        Select sel3 = new Select(selTxt3);
        sel2.selectByVisibleText("25");
        sel3.selectByVisibleText("35");

        Thread.sleep(2000);

        WebElement selTxt4 = driver.findElement(By.name("cm"));
        Select sel4 = new Select(selTxt4);
        sel4.selectByVisibleText("Hindu:Marathi");

        Thread.sleep(2000);

        WebElement selTxt5 = driver.findElement(By.name("ms"));
        Select sel5 = new Select(selTxt5);
        sel5.selectByValue("1");

        Thread.sleep(5000);
        driver.close();

    }
}
