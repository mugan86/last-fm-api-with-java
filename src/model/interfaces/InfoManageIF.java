package model.interfaces;

import java.io.File;

/**
 *
 * @author Anartz Muxika
 */
public interface InfoManageIF {

    /**
     *
     * @param info: Pass info to save in especific file (info in json, sql,...)
     * @param file_name_with_extension: Location and file name to save info
     */
    public void saveInFile(String info, String file_name_with_extension);
    
    public void readFileLines(File file);
}
