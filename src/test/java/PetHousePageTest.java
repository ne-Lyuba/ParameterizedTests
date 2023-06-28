import Data.Languages;
import Data.PetHouseTestData;
import Pages.PetHousePage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class PetHousePageTest extends PetHouseTestData {
    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Languages.values());
    }

    public PetHousePageTest(Languages lang) {
        petHouseBundle = ResourceBundle.getBundle(lang.getLang());
        if (!driver.getCurrentUrl().contains("https://" + "pethouse.ua/" + petHouseBundle.getString("language"))) {
            driver.get("https://" + "pethouse.ua/" + petHouseBundle.getString("language"));
            petHousePage = PageFactory.initElements(driver, PetHousePage.class);
        }
    }

    @Test
    public void testFerretsTab() {
        Assert.assertEquals(petHouseBundle.getString("ferretsTab"), petHousePage.ferretsTabTest());
    }

    @Test
    public void testBirdsTab() {
        Assert.assertEquals(petHouseBundle.getString("birdsTab"),petHousePage.birdsTabTest());
    }
    @Test
    public void testComparisonButton() {
        Assert.assertEquals(petHouseBundle.getString("comparisonButton"), petHousePage.comparisonButtonTest());
    }
    }
