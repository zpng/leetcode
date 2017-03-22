import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/3/22.
 */
public class FindMedianSortedArraysTest {

    @Test
    public void findMedianSortedArrays() throws Exception {
        int[] a1 = new int[]{1, 3};
        int[] a2 = new int[]{2};
        Assert.assertEquals(2.0, new FindMedianSortedArrays().findMedianSortedArrays(a1, a2), 0.1);
    }

}