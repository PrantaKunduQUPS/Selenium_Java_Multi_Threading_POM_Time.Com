package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_2_3_1_GlobalHelpCenter {
    WebDriver driver;


 public By digitalsubscription = By.xpath("/html/body/main/div[2]/div/section/ul/li[1]/a");

 public TC_2_3_1_GlobalHelpCenter(WebDriver driver){
     this.driver=driver;
 }

 public void scrollDown1() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,300)");
 }

//Xpath of clickable Sub menu
 public By globalcenter = By.xpath("/html/body/header/nav[2]/section/section[3]/ul/li[2]/a");

 //This function helps us to find the submenu of main menu. if main menu already click. Then, this function will be implemented to find sub menu.
 public void globalCenter(){
  JavascriptExecutor js = (JavascriptExecutor) driver;
  WebElement Global = driver.findElement(globalcenter);
  js.executeScript("arguments[0].scrollIntoView();", Global);
 }

 //Just click the sub menu Button
 public void globalCenterClick(){
  driver.findElement(globalcenter).click();
 }

 public void digitalSubscription(){
  driver.findElement(digitalsubscription).click();
 }


 //public By alllinks = By.xpath("/html/body/main/div[2]/div/section/ul/li");
 public void allLinks(){
  List<WebElement> alllinks = driver.findElements(By.xpath("/html/body/main/div[2]/div/section/ul/li"));
  WebElement q;
  for (int i =0; i<alllinks.size();i++){
   q = alllinks.get(i);
   q.click();
   driver.navigate().back();
  }

 }

}


