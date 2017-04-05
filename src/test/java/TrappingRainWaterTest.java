import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/5.
 */
public class TrappingRainWaterTest {
    @Test
    public void trap() throws Exception {
        Assert.assertEquals(6, new TrappingRainWater().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

}