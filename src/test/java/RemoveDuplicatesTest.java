import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/1.
 */
public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicates() throws Exception {
        Assert.assertEquals(3, new RemoveDuplicates().removeDuplicates(new int[]{1,1,2,2,3}));
    }

}