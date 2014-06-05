package com.knight.solid.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class RemoteFileType implements FileType
{
    @Override
    public boolean isInstanceOf(WebDriver driver) {
        return driver instanceof RemoteWebDriver;
    }

    @Override
    public File getFile(WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) new Augmenter().augment(driver);
        return ((ts).getScreenshotAs(OutputType.FILE));
    }
}
