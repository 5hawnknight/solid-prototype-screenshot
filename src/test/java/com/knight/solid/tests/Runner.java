package com.knight.solid.tests;

import com.knight.solid.screenshot.ScreenShotFileService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class Runner
{
    private WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }
    @Test
    public void testRunner()
    {
        File file = new ScreenShotFileService().getFile(driver);

        try
        {
            FileUtils.copyFile(file, new File("target/screenshots/savefile.png"));
        }
        catch (Exception e)
        {

        }
    }
    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}
