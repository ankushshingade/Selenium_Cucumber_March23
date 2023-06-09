package HtmlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectJobPostDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // 1. Find the element of multiselect list
        WebElement City = driver.findElement(By.id("source_118"));

        // 2. Create the object of Select class
        Select selCity = new Select(City);

        Thread.sleep(3000);
        // 3. Select from dropdown
        selCity.selectByVisibleText("Pune");

        Thread.sleep(3000);
        selCity.selectByValue("1");

        Thread.sleep(3000);
        selCity.selectByIndex(3);

        Thread.sleep(3000);
        WebElement AddBtn = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]"));
        AddBtn.click();

        Thread.sleep(3000);
        WebElement City_1 = driver.findElement(By.id("fld_118"));

        Select dselCity = new Select(City_1);

        dselCity.selectByValue("3");
        dselCity.selectByValue("17");

        Thread.sleep(3000);
        WebElement RemoveBtn = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]"));
        RemoveBtn.click();


        /*Thread.sleep(3000);
        selCity.deselectByIndex(3);

        Thread.sleep(3000);
        selCity.deselectByIndex(1);

        Thread.sleep(3000);
        selCity.deselectByIndex(0);
*/
       /* for(int i=0; i<5; i++) {
            if (selCity.isMultiple()) {
                Thread.sleep(3000);
                selCity.deselectByIndex(i);
            }

        }*/

        Thread.sleep(3000);
        driver.close();
    }
}
