import org.junit.Before;
import org.junit.Test;
import word_count.WordCount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.junit.Assert.*;


public class WordCountTest {

    @Test
    public void testSimpleWordCount() {
        String testStr = "hello this is a test";
        Integer testWordCount = 5;
        WordCount unitUnderTest = new WordCount(testStr);
        assertEquals(testWordCount, unitUnderTest.getWordCount());
    }

    @Test
    public void testSimpleReadFromFile() throws FileNotFoundException {
        InputStream inputFileStream = new FileInputStream("testFile.txt");
        Integer testWordCount = 5;
        WordCount unitUnderTest = new WordCount(inputFileStream);
        assertEquals(testWordCount, unitUnderTest.getWordCount());
    }
}
