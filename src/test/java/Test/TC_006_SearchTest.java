package Test;

import Base.Base;
import Pages.TC_006_Search;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;

public class TC_006_SearchTest extends Base {

    @Test
    public void homepageSearch() throws InterruptedException {
        driver.get(baseurl);
        Thread.sleep(5000);

        TC_006_Search search = homepage.Search();
        search.clickIcon();
        search.setSearchData("Bangladesh");
        search.clickSearchButton();
        search.postClick();
    }
}
