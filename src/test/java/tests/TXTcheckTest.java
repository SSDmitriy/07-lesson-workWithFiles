package tests;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//hamcrest libs for matching texts
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class TXTcheckTest {

    //create File object from TXT-file and expected substring
    File txtFile = new File("./src/test/resources/txtFOrTest.txt");
    String expectedSubstr = "Отличный софт";

    @Test
    void txtChecking() throws IOException {

        String actualText = FileUtils.readFileToString(txtFile, StandardCharsets.UTF_8);
        assertThat(actualText, containsString(expectedSubstr));
    }
}
