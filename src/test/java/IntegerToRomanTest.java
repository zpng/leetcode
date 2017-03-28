import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/28.
 */
public class IntegerToRomanTest {

    @Test
    public void intToRoman() throws Exception {

        assertEquals("MMCMXXXI", new IntegerToRoman().intToRoman(2931));
    }

}