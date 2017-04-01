import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/1.
 */
public class StrStrTest {

    @Test
    public void strStr() throws Exception {
        Assert.assertEquals(-1, new StrStr().strStr("123sb", "se"));
        Assert.assertEquals(1, new StrStr().strStr("123sb", "23"));
        Assert.assertEquals(-1, new StrStr().strStr("123sb", "23456"));
    }

}