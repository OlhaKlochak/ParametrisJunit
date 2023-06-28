package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutodocPage {

    @FindBy(xpath = "//a[@class='header-i header-i--truck ga-click']")
    WebElement tab1;
    @FindBy(xpath = "//a[@class='header-i header-i--moto ga-click']")
    WebElement tab2;
    @FindBy(id = "//a[@class='header-i header-i--tyre ga-click']")
    WebElement tab3;

    public AutodocPage(WebDriver driver) {
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

