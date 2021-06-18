package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.MyFilesActions.makePdfFile;
import static utils.MyFilesActions.makeXlsFile;

//teamplate for XLS
//need include to build.gradle   testImplementation "com.codeborne:xls-test:1.2"
//https://github.com/codeborne/xls-test
// @Test
//  public void canAssertThatXlsContainsText() {
//    XLS spreadsheet = new XLS(getClass().getClassLoader().getResource("statement.xls"));
//    assertThat(spreadsheet, XLS.containsText("Statement"));
//  }
public class XlsTest {

    //test data
    //path for XLS
    String path = "./src/test/resources/xlsForTest.xls";

    //excepted result for XLS
    String exceptedText = "в документации.";

    //test for XLS
    @Test
    void xlsChecking() throws IOException {

        //make File with "path"
        XLS xls = makeXlsFile(path);

        //Check string for excepted text
        assertThat(xls, XLS.containsText(exceptedText));
    }
}
