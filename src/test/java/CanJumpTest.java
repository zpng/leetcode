import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/11.
 */
public class CanJumpTest {
    @Test
    public void canJump() throws Exception {
        Assert.assertEquals(true, new CanJump().canJump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertEquals(false, new CanJump().canJump(new int[]{3, 2, 1, 0, 4}));
    }

}