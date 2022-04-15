package word_count;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class WordCount {
    private String inputString;
    public WordCount(String str) {
        this.inputString = str;
    }
    public WordCount(InputStream stream) throws IOException {
        this.inputString = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
    }

    public Integer getCharCount() {
        return this.inputString.length();
    }

    public Integer getWordCount(){
        if(isInputStringEmpty()){
            return 0;
        }
        return this.inputString.split("\\s+").length;
    }

    private Boolean isInputStringEmpty(){
        return inputString == "" || inputString == null;
    }
}
