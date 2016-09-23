import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by STG Dev Center on 9/9/2016.
 */
public class SkiUtahPage {

    public List<WebElement> mainMenuItems;
    public List<WebElement> subMenuItems;

    //region Constructors
    public SkiUtahPage(WebDriver driver)
    {
        // TODO Identify the mainMenuItems and subMenuItems, and put them into lists
    }
//endregion

//region METHODS

    /**
     * Hovers on a menu item, and clicks the designated sub-menu item, and verifies that the submenu link opens the expected page by matching the actual title to the
     * @param subMenuItem A String representing the text of the submenu item that you want to click, i.e. "Brighton"
     * @param expectedTitle A String representing the title of the new web page.
     * @return A boolean representing whether or not the actual title has the same value as expectedTitle.
     */
    public Boolean ClickSubmenuItem(String subMenuItem, String expectedTitle)
    {
        //TODO Hover on the main menu item to make the submenus visible
        //TODO If the subMenu entry that corresponds to menuItem is visible, click on it.
        //TODO Compare the Title of the new page to the expectedTitle, to see if they match.
        //TODO Return the results of the comparison
        return false;
    }



//endregion

}