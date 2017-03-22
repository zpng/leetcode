import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/22.
 */
public class LongestPalindromeTest {

    @Test
    public void longestPalindrome() throws Exception {
        assertEquals("bb", new LongestPalindrome().longestPalindrome("cbbd"));
    }

}