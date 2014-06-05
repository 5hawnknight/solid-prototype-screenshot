package com.knight.solid.screenshot;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class RegisterFileTypesService implements RegisterFileTypes
{
    private List<FileType> fileTypes;

    public RegisterFileTypesService()
    {
        fileTypes = Arrays.asList(
                        new FireFoxFileType(),
                        new PhantomJSFileType(),
                        new RemoteFileType());
    }
    @Override
    public List<FileType> get()
    {
        return fileTypes;
    }
    @Override
    public FileType getDefaultType()
    {
        return new RemoteFileType();
    }
}
