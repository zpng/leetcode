import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/28.
 */
public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() throws Exception {
        assertEquals("abc", new LongestCommonPrefix().longestCommonPrefix(new String[]{"abcd",
                "abc", "abce"}));
    }

}