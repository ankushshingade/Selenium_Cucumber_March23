package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/Ankush/OneDrive/Desktop/Selenium_Cucumber_March23/amol.html");

        // 1. Find the element of drop down
        WebElement MultiSelect = driver.findElement(By.id("multiSel"));

        // 2. Create the object of Select class
        Select sel = new Select(MultiSelect);

        Thread.sleep(3000);
        // 3. Select from dropdown
        sel.selectByVisibleText("text 2");

        Thread.sleep(3000);
        sel.selectByIndex(3);

        Thread.sleep(3000);
        sel.selectByIndex(0);

        Thread.sleep(3000);
        sel.deselectAll();

        /*Thread.sleep(3000);
        sel.deselectByIndex(3);

        Thread.sleep(3000);
        sel.deselectByIndex(1);

        Thread.sleep(3000);
        sel.deselectByIndex(0);
*/
       /* for(int i=0; i<5; i++) {
            if (sel.isMultiple()) {
                Thread.sleep(3000);
                sel.deselectByIndex(i);
            }

        }*/

        Thread.sleep(3000);
        driver.close();
    }
}
