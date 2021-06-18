package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.MyFilesActions.makePdfFile;

//teamplate for PDFs
//need include to build.gradle   testImplementation "com.codeborne:pdf-test:1.5.1"
//https://github.com/codeborne/pdf-test
//@Test
//public void canAssertThatPdfContainsText() {
//        PDF pdf = new PDF(new File("src/test/resources/50quickideas.pdf"));
//        assertThat(pdf, containsText("50 Quick Ideas to Improve your User Stories"));
//        }
public class PdfTest {

    //test data
    //path for PDF
    String path = "./src/test/resources/pdfForTest.pdf";

    //excepted result for PDF
    String expectedText = "не нуждается";

    //test for PDF
    @Test
    void pdfChecking() throws IOException {

        //make File with "path"
        PDF pdf = makePdfFile(path);

        //Check string for excepted text
        assertThat(pdf, PDF.containsText(expectedText));
    }
}
