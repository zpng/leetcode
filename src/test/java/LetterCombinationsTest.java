import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/28.
 */
public class LetterCombinationsTest {

    @Test
    public void letterCombinations() throws Exception {
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
                new LetterCombinations().letterCombinations("23"));

    }

}