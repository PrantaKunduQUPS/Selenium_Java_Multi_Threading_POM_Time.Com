package Test;

import Base.Base;
import Pages.TC_2_1_1_World;
import Pages.TC_2_5_1_California;
import Pages.TC_3_1_1_Google;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;

public class TC_3_1_1_GoogleTest extends Base {

    @Test
    public void Google() throws InterruptedException {

        driver.get(signIn);
        TC_3_1_1_Google google = homepage.Google();
        //google.craeteOne();
        Thread.sleep(3000);
        google.Google();


    }

}
