package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try{
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo hacer click sobre el elmento "+element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try{
           return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elmento "+element);
        }
    }

    public String getText(By element) throws Exception {
        try{
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elmento "+element);
        }
    }

    public String getTitle() throws Exception {
        try{
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo del driver ");
        }
    }

}
