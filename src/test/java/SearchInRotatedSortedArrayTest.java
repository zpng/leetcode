import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/1.
 */
public class SearchInRotatedSortedArrayTest {
    @Test
    public void search() throws Exception {
        Assert.assertEquals(1, new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
        Assert.assertEquals(-1, new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 8));
        Assert.assertEquals(4, new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

}