import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/22.
 */
public class ZigZagConversionTest {

    @Test
    public void convert() throws Exception {
        assertEquals("PAHNAPLSIIGYIR", new ZigZagConversion().convert("PAYPALISHIRING", 3));
    }

}