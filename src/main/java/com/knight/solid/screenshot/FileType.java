package com.knight.solid.screenshot;

import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public interface FileType
{
    boolean isInstanceOf(WebDriver driver);
    File getFile(WebDriver driver);
}
