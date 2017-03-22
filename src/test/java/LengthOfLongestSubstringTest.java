import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/3/22.
 */
public class LengthOfLongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() throws Exception {

        int length = new LengthOfLongestSubstring().lengthOfLongestSubstring("abbcdeef");
        Assert.assertEquals(4, length);
    }

}