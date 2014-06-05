package com.knight.solid.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.io.File;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class PhantomJSFileType implements FileType
{
    @Override
    public boolean isInstanceOf(WebDriver driver) {
        return driver instanceof PhantomJSDriver;
    }

    @Override
    public File getFile(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    }
}
