package runner.browser_manager;


<<<<<<< HEAD
import org.openqa.selenium.opera.OperaDriver;

public class OperaDriverManager extends DriverManager{
=======
import org.openqa.selenium.chrome.ChromeDriver;

public class OperaDriverManager extends DriverManager {
>>>>>>> 0a9a3396976f30d6e629efc059c6c2d647b0a932

    @Override
    public void createDriver(){
        System.setProperty("webdriver.opera.driver", "./src/test/resources/operadriver/operadriver.exe");
<<<<<<< HEAD
        driver = new OperaDriver();
=======
        driver = new ChromeDriver();
>>>>>>> 0a9a3396976f30d6e629efc059c6c2d647b0a932
    }

}
