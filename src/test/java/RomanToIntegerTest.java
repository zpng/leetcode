import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/28.
 */
public class RomanToIntegerTest {

    @Test
    public void romanToInt() throws Exception {
        assertEquals(2931, new RomanToInteger().romanToInt("MMCMXXXI"));
    }

}