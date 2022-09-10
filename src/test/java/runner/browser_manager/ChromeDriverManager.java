package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

<<<<<<< HEAD
=======

>>>>>>> 0a9a3396976f30d6e629efc059c6c2d647b0a932
    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
