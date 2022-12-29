package testcases;

import com.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  class BaseTest {

    @SuppressWarnings("unchecked")
    @BeforeMethod
    public void setup(){
        Driver.init();
    }
    @AfterMethod
    public void tearDown(){
        Driver.quit();
    }
}
