/**
 * IMPORTANT NOTE:
 * This class runs the unit tests for your code solution.
 * If your code does not pass these tests, your solution is not complete.
 * If you want to add more test methods, that's fine.
 * DO NOT RENAME OR DELETE ANY OF THE EXISTING TEST METHODS IN THIS FILE.
 * REALLY.
 * Created 9/16/2016.
 */

//region imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

//endregion

public class VerificationTests {
        //region Member Elements
        public WebDriver driver;
        public SkiUtahPage page;
        public TestHelper helper;

        //endregion

    @BeforeSuite
    public void SetUpTestSuite()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout((long)20, TimeUnit.SECONDS);
        //If this returns an error, you may need to add the path to the chrome executable to your global "Path" variable.
        helper = new TestHelper();
    }

    @BeforeTest
    public void OpenPage()
    {
        try{
            driver.get("https://www.skiutah.com/");
            page = new SkiUtahPage(driver);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    //region Tests
    @Test
    public void verifyMainMenuIsFound()
    {
        Assert.assertFalse(page.mainMenuItems.isEmpty());
    }

    @Test
    public void verifySubMenuIsFound()    {
        Assert.assertFalse(page.subMenuItems.isEmpty());
    }

    @Test
    public void FindMenuValid()
    {
        Assert.assertTrue(page.ClickSubmenuItem("Eagle Point", "Eagle Point - Ski Utah"));
    }

    @BeforeTest
    public void goBack1(){
        page = helper.goBack(driver, page);
    }

    @Test
    public void FindMenuInvalid()
    {
        Assert.assertFalse(page.ClickSubmenuItem("Eagle Point", "Brighton"));
    }

    @BeforeTest
    public void goBack2(){
        page = helper.goBack(driver, page);
    }


    @Test
    public void SubMenuInvalid()
    {
        Assert.assertFalse(page.ClickSubmenuItem("Not an actual resort", "Nothing"));
    }

//endregion

    @AfterSuite
    public void TearDown()
    {
        driver.close();
    }
}