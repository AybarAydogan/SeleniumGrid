package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid01 {

   static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

         driver = new RemoteWebDriver(new URL(" http://192.168.1.104:4444"), new ChromeOptions());
         driver.get("https://wisequarter.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }


    @Test
    void edgeTest() throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://192.168.1.104:4444"), new EdgeOptions());
        driver.get("https://wisequarter.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }


}
