import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/4/12.
 */
public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() throws Exception {
        assertEquals(5,new LengthOfLastWord().lengthOfLastWord("Hello World"));
        assertEquals(5,new LengthOfLastWord().lengthOfLastWord("Hello World  "));
    }

}