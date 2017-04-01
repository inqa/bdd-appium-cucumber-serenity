package Steps.Facebook;

import PageObjects.My.ContactDetail;
import PageObjects.My.ContactSearch;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Andrew on 31/03/2017.
 */
public class MyUserSteps {

    @Steps
    ContactDetail contactDetail;
    ContactSearch contactSearch;


    public MyUserSteps(WebDriver driver) {
        contactDetail = new ContactDetail(driver);
        contactSearch = new ContactSearch(driver);

    }

    @Step
    public void searchFor(String searchText) {
        contactSearch.search(searchText);
    }

    @Step
    public String getResult() {
        String searchResult = contactSearch.getFirstSearchResult();
        return searchResult;
    }
}
