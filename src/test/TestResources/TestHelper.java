import org.openqa.selenium.WebDriver;

/**
 * Created by on 9/16/2016.
 * Helper methods for Tests
 */
public class TestHelper {


        public TestHelper(){

        }

        public SkiUtahPage goBack(WebDriver driver, SkiUtahPage homePage)
        {
            //gets back to the home page and creates a new SkiUtahPage Object. This prevents StaleElementExceptions.
            driver.get("https://www.skiutah.com/");
            homePage = new SkiUtahPage(driver);
            return homePage;
        }

    }


