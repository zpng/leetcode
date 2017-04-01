import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/1.
 */
public class LongestValidParenthesesTest {
    @Test
    public void longestValidParentheses() throws Exception {

        Assert.assertEquals(4, new LongestValidParentheses().longestValidParentheses(")()()"));

    }

}