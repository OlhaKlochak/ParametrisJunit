import config.BaseClass;
import data.BuferWiki;
import data.Language;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.Wikipage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

import static example.DATA.i;
@RunWith(Parameterized.class)
public class WikiTest extends BuferWiki {
    Language language;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Language.values());
    }

    public WikiTest(Language language) {
        this.language = language;
        if (!driver.getCurrentUrl().contains("https://" + language.getLang() + ".wikipedia.org/")) {
            driver.get("https://" + language.getLang() + ".wikipedia.org/");
            System.out.println(i++);
            wikiBundle= ResourceBundle.getBundle(language.getLang());
            wikipage= PageFactory.initElements(driver, Wikipage.class);
        }
    }
    @Test
    public void tesrTab1(){
        Assert.assertEquals(wikiBundle.getString("tab1"),wikipage.tab1Test());

    }
    @Test
    public void tesrTab2(){
        Assert.assertEquals(wikiBundle.getString("tab2"),wikipage.tab2Test());

    }
    @Test
    public void tesrTab3(){
        Assert.assertEquals(wikiBundle.getString("tab3"),wikipage.tab3Test());

    }
}