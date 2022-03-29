package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_3_1_2_Facebook {

    //public By createone = By.xpath("/html/body/div[2]/div/h3/a");
    public By facebook = By.id("sign-up-facebook");

    WebDriver driver;
    public TC_3_1_2_Facebook(WebDriver driver){
        this.driver=driver;
    }
      public void Facebook(){
        driver.findElement(facebook).click();
    }

}
