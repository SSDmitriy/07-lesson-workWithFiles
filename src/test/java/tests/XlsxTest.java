package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.MyFilesActions.makeXlsxFile;

//teamplate for XLSX see in MyFileActions
public class XlsxTest {

    //test data
    //path for XLSX
    String path = "./src/test/resources/xlsxForTest.xlsx";

    //excepted result for XLSX
    String expectedText = "Отличный софт";

    //test for XLSX
    @Test
    void xlsxChecking() {

        //make File with "path"
        String actualData = makeXlsxFile(path);

        //Check string for excepted text
        assertThat(actualData, containsString(expectedText));
    }
}
