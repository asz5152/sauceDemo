package core.utils.SeleniumHook;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SeleniumRunner {

    public static WebDriver webDriver;

    public static void startSeleniumServer(String applicationUnderTest)
    {
        if (webDriver == null)
        {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver(chromeOptions);

            webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            webDriver.get(applicationUnderTest);
            webDriver.manage().window().maximize();
        }
    }

    public static WebDriver getSeleniumDriver()
    {
        if (webDriver != null)
            return webDriver;
        else
            System.out.println("WEB Driver not initialized!");
        return null;
    }



}
