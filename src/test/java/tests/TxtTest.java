package tests;

import org.junit.jupiter.api.Test;
import utils.MyFilesActions;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

//1.Make "File" from txt-file
//2.Convert "File" to String
//3.Search expected symbols (substring) in "String" with hamcrest library
public class TxtTest {

    //test data
    //path for TXT
    String path = "./src/test/resources/txtForTest.txt";

    //excepted result for TXT, XLS, XSLX, PDF
    String exceptedText = "Отличный софт";

    //test for TXT
    @Test
    void txtChecking() throws IOException {

        //make File with "path"
        File checkingFile = MyFilesActions.makeFile(path);
        //convert File to string
        String actualText = MyFilesActions.stringFromFile(checkingFile);
        //Check string for excepted text
        assertThat(actualText, containsString(exceptedText));
    }
}
