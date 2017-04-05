import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/5.
 */
public class WildcardMatchingTest {
    @Test
    public void isMatch() throws Exception {

        Assert.assertEquals(false, new WildcardMatching().isMatch("aa", "a"));
        Assert.assertEquals(true, new WildcardMatching().isMatch("aa", "aa"));
        Assert.assertEquals(false, new WildcardMatching().isMatch("aaa", "aa"));
        Assert.assertEquals(true, new WildcardMatching().isMatch("aa", "*"));
        Assert.assertEquals(true, new WildcardMatching().isMatch("ab", "?*"));
        Assert.assertEquals(false, new WildcardMatching().isMatch("aab", "c*a*b"));
    }

}