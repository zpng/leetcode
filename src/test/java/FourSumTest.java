import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/31.
 */
public class FourSumTest {

    @Test
    public void fourSum() throws Exception {
        assertEquals(Arrays.asList(Arrays.asList(-2, -1, 1, 2), Arrays.asList(-2, 0, 0, 2),
                Arrays.asList(-1, 0, 0, 1)),
                new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }

}