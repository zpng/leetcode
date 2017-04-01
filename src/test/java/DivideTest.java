import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/1.
 */
public class DivideTest {

    @Test
    public void divide() throws Exception {
        Assert.assertEquals(50000, new Divide().divide(100000,2));
        Assert.assertEquals(Integer.MAX_VALUE, new Divide().divide(100000,0));
    }

}