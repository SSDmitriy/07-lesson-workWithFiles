package utils;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class ZipActions {
    public static void unzip(String zipPath, String unZipFolderPath, String zipPassword) throws ZipException {
        ZipFile zipFile = new ZipFile(zipPath);
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(zipPassword);
        }
        zipFile.extractAll(unZipFolderPath);
    }

}
