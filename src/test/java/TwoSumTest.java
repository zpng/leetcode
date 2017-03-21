import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/3/21.
 */
public class TwoSumTest {

    @Test
    public void twoSum2() throws Exception {

        Assert.assertArrayEquals(new int[]{1,2}, new TwoSum().twoSum2(new int[]{1,2,3,5},5));
    }

    @Test
    public void twoSum() throws Exception {
        Assert.assertArrayEquals(new int[]{1,2}, new TwoSum().twoSum(new int[]{1,2,3,5},5));
    }

}