import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/1.
 */
public class RemoveElementTest {

    @Test
    public void removeElement() throws Exception {
        Assert.assertEquals(2, new RemoveElement().removeElement(new int[]{3, 2, 2, 3}, 3));
    }

}