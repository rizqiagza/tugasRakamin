import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

public class Login{
    @Test //tag untuk running script tersebut
    public void open_browser(){
        WebDriver driver;
        String baseUrl = "https://saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);

        driver.close();
    }
}
