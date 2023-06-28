package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetHousePage {
    @FindBy(id = "tpl-top-menu-first-li-3")
    WebElement ferretsTab;
    @FindBy(id = "tpl-top-menu-first-li-6")
    WebElement birdsTab;
    @FindBy(className = "compare-big")
    WebElement comparisonButton;

    public String ferretsTabTest() {
        return ferretsTab.findElement(By.tagName("a")).getText();
    }
    public String birdsTabTest() {
        return birdsTab.findElement(By.tagName("a")).getText();
    }
    public String comparisonButtonTest(){
        return comparisonButton.getText();
    }
}
