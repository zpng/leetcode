import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/28.
 */
public class ThreeSumTest {

    @Test
    public void threeSum() throws Exception {
        assertEquals(Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)),
                new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}