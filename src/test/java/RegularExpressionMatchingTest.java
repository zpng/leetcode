import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/26.
 */
public class RegularExpressionMatchingTest {

    @Test
    public void isMatch() throws Exception {
        assertEquals(false, new RegularExpressionMatching().isMatch("aa", "a"));
        assertEquals(true, new RegularExpressionMatching().isMatch("aa", "aa"));
        assertEquals(false, new RegularExpressionMatching().isMatch("aaa", "aa"));
        assertEquals(true, new RegularExpressionMatching().isMatch("aa", "a*"));
        assertEquals(true, new RegularExpressionMatching().isMatch("aa", ".*"));
        assertEquals(true, new RegularExpressionMatching().isMatch("ab", ".*"));
        assertEquals(true, new RegularExpressionMatching().isMatch("aab", "c*a*b"));
    }

}