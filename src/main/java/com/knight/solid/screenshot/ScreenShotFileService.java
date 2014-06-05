package com.knight.solid.screenshot;

import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class ScreenShotFileService
{
    private RegisterFileTypes registerFileTypes = new RegisterFileTypesService();

    public File getFile(WebDriver driver)
    {
        for (FileType fileType : registerFileTypes.get())
        {
            if (fileType.isInstanceOf(driver))
                return fileType.getFile(driver);
        }
        return registerFileTypes.getDefaultType().getFile(driver);
    }
}
