package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wikipage {
    @FindBy(id = "ca-view")
    WebElement tab1;
    @FindBy(id = "ca-viewsource")
    WebElement tab2;
    @FindBy(id = "ca-history")
    WebElement tab3;

    public Wikipage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public String tab1Test() {
        return tab1.findElement(By.tagName("span")).getText();
    }

    public String tab2Test() {
        return tab2.findElement(By.tagName("span")).getText();
    }

    public String tab3Test() {
        return tab3.findElement(By.tagName("span")).getText();
    }
}
