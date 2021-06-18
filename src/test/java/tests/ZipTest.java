package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;
import utils.MyFilesActions;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.ZipActions.unzip;

//1.Unzip file to PATH
//2.Make "File" from txt-file (PATH)
//3.Convert "File" to String
//4.Search expected symbols (substring) in "String" with hamcrest library
public class ZipTest {

    //test data
    //path for ZIP and UNzip files
    String zipPath = "./src/test/resources/zipForTest.zip";
    String unZipFolderPath = "./src/test/resources/unzip";
    String zipPassword = "123";
    String unZippedTxtFilePath = unZipFolderPath +"/txtForTest.txt";

    //excepted result for ZIP
    String expectedText = "Отличный софт";

    //test for ZIP with password
    @Test
    void txtChecking() throws IOException, ZipException {

        //unzip archive
        unzip(zipPath, unZipFolderPath, zipPassword);

        //make File with "path"
        File checkingFile = MyFilesActions.makeFile(unZippedTxtFilePath);

        //convert File to string
        String actualText = MyFilesActions.stringFromFile(checkingFile);

        //Check string for excepted text
        assertThat(actualText, containsString(expectedText));
    }
}
