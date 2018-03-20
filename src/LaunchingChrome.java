import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingChrome {


    @Test
    public void testGoogleSearch() {

        WebDriver driver = LaunchingChrome.chromeDriverInitializatrion();
        driver.get();


    }

    private static WebDriver chromeDriverInitializatrion(){
        String exePath = "C:\\Users\\radoslaw.wartalski\\Downloads\\chromikdriver)\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        return driver;

    }
}

