package manage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverManage {

    static WebDriver driver;

    DesiredCapabilities capabilities = new DesiredCapabilities();

    public WebDriver remoteChromeSetUp() {

        capabilities.setPlatform(Platform.WIN10);
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("122.0.6261.70");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(capabilities);

        try {
            driver = new RemoteWebDriver(new URL(ConfigReader.getProperty("hubUrl")), chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        System.out.println("***** Remote Chrome Driver *****");


        return driver;
    }

    public static void setDriver(String browser) {

        switch (browser) {

            case "grid_chrome": {

                ChromeOptions chromeOptions = new ChromeOptions();
                try {
                    driver = new RemoteWebDriver(new URL(ConfigReader.getProperty("hubUrl")), chromeOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("***** Selenium Grid ChromeDriver *****");
            }


        }
    }
}
