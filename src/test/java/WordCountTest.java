import org.junit.Before;
import org.junit.Test;
import word_count.WordCount;

import java.io.*;
import java.util.Optional;

import static org.junit.Assert.*;


public class WordCountTest {

    @Test
    public void testSimpleWordCount() {
        String testStr = "hello this is a test";
        Integer testWordCount = 5;
        WordCount wordCount = new WordCount(testStr);
        assertEquals(testWordCount, wordCount.getWordCount());
    }

    @Test
    public void testSimpleReadFromFile() throws IOException {
        String testStr = "hello this is a test";
        Integer testWordCount = 5;
        var filePath = makeTestFileAndGetPath(testStr);
        FileInputStream inputFileStream = new FileInputStream(filePath);

        WordCount wordCount = new WordCount(inputFileStream);
        assertEquals(testWordCount, wordCount.getWordCount());
        inputFileStream.close();
    }

    @Test
    public void testEmptyStringReturnsZero() {
        var wordCount = new WordCount("");
        Integer expectedCount = 0;
        assertEquals(expectedCount, wordCount.getWordCount());
    }

    private String makeTestFileAndGetPath(String testString) throws IOException {
        final String FILE_LOCATION = "src/test/java/testFile.txt";
        File fileObj = new File(FILE_LOCATION);
        fileObj.createNewFile();
        FileWriter writer = new FileWriter(fileObj);
        writer.write(testString);
        writer.close();
        return FILE_LOCATION;
    }
}
