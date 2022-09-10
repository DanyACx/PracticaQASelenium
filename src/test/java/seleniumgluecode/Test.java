package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

<<<<<<< HEAD
public class Test extends TestBase{
=======
public class Test {

    private WebDriver driver = Hooks.getDriver();
>>>>>>> 0a9a3396976f30d6e629efc059c6c2d647b0a932

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void elUsuarioSeEncuentraEnLaPaginaHomeDeImalittletester() throws Throwable {

        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void haceClickSobreElBotonTheLittleTesterComics() throws Throwable {

        homePage.clickOnTitleComics();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void seDebeRedirigirALaPantallaComics() throws Throwable {

        Assert.assertTrue("No se redireccino correctamente a la pagina de Comics", comicsPage.isTitleComicsDisplayed());
    }
}
