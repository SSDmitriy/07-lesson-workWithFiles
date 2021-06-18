package utils;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MyFilesActions {

    //make "File-objet" for TXT from path
    public static File makeFile(String path){
        return new File(path);
    }

    //convert "File-object" to string
    public static String stringFromFile(File file) throws IOException {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8 );
    }

    //make File-object of PDF-type from path
    public static PDF makePdfFile(String path) throws IOException {
        return new PDF(new File(path));
    }

    //make File-object of XLS-type from path
    public static XLS makeXlsFile(String path) throws IOException {
        return new XLS(new File(path));

    }
}
