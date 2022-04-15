import org.junit.Before;
import org.junit.Test;
import word_count.WordCount;
import static org.junit.Assert.*;


public class WordCountTest {

    @Test
    public void testSimpleWordCount() {
        String testStr = "hello this is a test";
        Integer testWordCount = 5;
        WordCount unitUnderTest = new WordCount(testStr);
        assertEquals(testWordCount, unitUnderTest.getWordCount());
    }
}
