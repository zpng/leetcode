import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/5.
 */
public class MultiplyStringsTest {

    @Test
    public void multiply() throws Exception {
        Assert.assertEquals("755619", new MultiplyStrings().multiply("3243", "233"));
    }

}