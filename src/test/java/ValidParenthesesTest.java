import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/3/31.
 */
public class ValidParenthesesTest {
    @Test
    public void isValid() throws Exception {

        Assert.assertEquals(true, new ValidParentheses().isValid("({[]})"));
        Assert.assertEquals(false, new ValidParentheses().isValid("({[{]})"));
    }

}