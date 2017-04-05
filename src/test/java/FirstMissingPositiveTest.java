import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/5.
 */
public class FirstMissingPositiveTest {
    @Test
    public void firstMissingPositive() throws Exception {
        Assert.assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[]{0}));
        Assert.assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

}