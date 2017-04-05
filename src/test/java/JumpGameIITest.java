import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/5.
 */
public class JumpGameIITest {
    @Test
    public void jump() throws Exception {
        Assert.assertEquals(2, new JumpGameII().jump(new int[]{2, 3, 1, 1, 4}));
    }

}