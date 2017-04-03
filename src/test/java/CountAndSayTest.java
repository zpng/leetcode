import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/4/3.
 */
public class CountAndSayTest {

    @Test
    public void countAndSay() throws Exception {
        for (int i = 1; i <= 30; i++) {
            System.out.println(new CountAndSay().countAndSay(i));
        }
    }

}