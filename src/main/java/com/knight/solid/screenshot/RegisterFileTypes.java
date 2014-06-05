package com.knight.solid.screenshot;

import java.util.List;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public interface RegisterFileTypes {

    List<FileType> get();

    FileType getDefaultType();
}
