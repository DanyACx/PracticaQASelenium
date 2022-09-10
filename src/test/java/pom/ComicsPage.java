package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComicsPage extends BasePage{

   private By pageTituloLocator = By.className("page-title");
   private String titlePage = "Category: comics";

    public ComicsPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleComicsDisplayed () throws Exception {
        return this.isDisplayed(pageTituloLocator) && this.getText(pageTituloLocator).equals(titlePage);
    }

}
