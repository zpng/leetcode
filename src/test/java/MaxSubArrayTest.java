import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/11.
 */
public class MaxSubArrayTest {

    @Test
    public void maxSubArray() throws Exception {
        Assert.assertEquals(6, new MaxSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

}