package tests;

import manage.DriverManage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Grid02 {

    DriverManage driverManage = new DriverManage();
    static WebDriver driver;


    @Test
    void remoteChromTest(){

       driver = driverManage.remoteChromeSetUp();
        driver.get("https://www.testotomasyonu.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }
}
