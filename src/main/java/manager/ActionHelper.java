package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionHelper extends HelperBase{
    public ActionHelper(WebDriver wd) {
        super(wd);
    }

    public void droppebleTests() {
        WebElement dragMe =wd.findElement(By.id("draggable"));
        WebElement dropHere= wd.findElement(By.id("droppable"));
        dragMe.click();

        Actions actions= new Actions(wd);
        actions.dragAndDrop(dragMe,dropHere).build().perform();
        pause(3000);

        String text = dropHere.getText();
        if(text.equals("Dropped!"))
        {
            System.out.println("Pass : Dropped!");
        } else {
            System.out.println("Fail: Not Dropped");
        }
    }

    public void selectDropable() {
        hideFooter();
        click(By.xpath("//span[text()='Droppable']"));
        
    }

    public void selectInterations() {
        if(isElementPresent(By.id("close-fixedban"))) {
            click(By.id("close-fixedban"));
        }
        click(By.xpath("//div[@class='category-cards']/div[5]"));
        pause(500);
    }
}
