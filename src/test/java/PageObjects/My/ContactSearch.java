package PageObjects.My;

import PageObjects.Page;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Andrew on 31/03/2017.
 */
public class ContactSearch extends Page {

    public ContactSearch(WebDriver driver) { super (driver); }

    @FindBy(id = "main_search")
    public WebElement searchField;

    @FindBy(id = "name")
    public WebElement firstSearchResultName;

    @Step
    public void search(String name) {
        searchField.sendKeys(name);
    }

    @Step
    public String getFirstSearchResult() {
        return firstSearchResultName.getText();
    }
}
