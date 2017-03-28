import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/28.
 */
public class ThreeSumClosestTest {

    @Test
    public void threeSumClosest() throws Exception {
        assertEquals(2, new ThreeSumClosest().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

}