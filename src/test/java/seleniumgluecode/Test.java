package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private WebDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void elUsuarioSeEncuentraEnLaPaginaHomeDeImalittletester() throws Throwable {
        String tituloHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(tituloHomePage, driver.getTitle());
    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void haceClickSobreElBotonTheLittleTesterComics() throws Throwable {
        WebElement tituloComicsLocator = driver.findElement(By.id("menu-item-2008"));
        tituloComicsLocator.click();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void seDebeRedirigirALaPantallaComics() throws Throwable {
        WebElement pageTituloLocator = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redireccino correctamente a la pagina de Comics", pageTituloLocator.isDisplayed());
        Assert.assertEquals("Category: comics", pageTituloLocator.getText());

    }
}
