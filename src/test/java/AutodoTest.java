import data.BuferAuto;
import data.BuferWiki;
import data.Language;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.AutodocPage;
import pages.Wikipage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

import static example.DATA.i;



@RunWith(Parameterized.class)
public class AutodoTest extends BuferAuto {
    Language language;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Language.values());
    }

    public AutodoTest(Language language) {
        this.language = language;
        if (!driver.getCurrentUrl().contains("https://autodoc." + language.getLang())) {
            driver.get("https://autodoc." + language.getLang());
            System.out.println(i++);
            autoBundle = ResourceBundle.getBundle(language.getLang());
            autodocPage = PageFactory.initElements(driver, AutodocPage.class);
        }
    }

    @Test
    public void tesrTab1() {
        Assert.assertEquals(autoBundle.getString("tab1"), autodocPage.tab1Test());

    }

    @Test
    public void tesrTab2() {
        Assert.assertEquals(autoBundle.getString("tab2"), autodocPage.tab2Test());

    }

    @Test
    public void tesrTab3() {
        Assert.assertEquals(autoBundle.getString("tab3"), autodocPage.tab3Test());

    }
}