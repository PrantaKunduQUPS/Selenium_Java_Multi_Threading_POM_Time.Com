package Pages;
import org.openqa.selenium.*;

import java.util.List;

public class TC_007_Time100 {
    WebDriver driver;

    public TC_007_Time100(WebDriver driver){
        this.driver=driver;
    }

    //Xpath of clickable Sub menu
    public By time= By.xpath("/html/body/header/nav[2]/section/section[1]/ul/li[19]/a");
    public By video = By.xpath("/html/body/div[2]/section/div[1]/div[6]/div/div[1]/div[1]/div[3]/div[1]/div/div");

    //This function helps us to find the submenu of main menu. if main menu already click. Then, this function will be implemented to find sub menu.
    public void time100(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement time100 = driver.findElement(time);
        js.executeScript("arguments[0].scrollIntoView();", time100);
    }

    public void time100Click(){
        driver.findElement(time).click();
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)");
    }

    public void Entertainment() {
        List<WebElement> entertainment = driver.findElements(By.xpath("/html/body/div[2]/section/div[1]/div[2]/ul/li"));
        for (WebElement allentertainment : entertainment) {
            if (allentertainment.getText().trim().equals("ENTERTAINMENT")) {
                allentertainment.click();
                break;
            }
        }
    }

      /*public void Video1() {
            driver.findElement(video).click();
            driver.execute_script("arguments[0].muted = true;", video);
       }*/
    }


