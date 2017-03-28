import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/28.
 */
public class ContainerWithMostWaterTest {

    @Test
    public void maxArea() throws Exception {
        assertEquals(2, new ContainerWithMostWater().maxArea(new int[]{1, 2, 1}));
        assertEquals(4, new ContainerWithMostWater().maxArea(new int[]{1, 2, 1, 3, 1}));
    }

}