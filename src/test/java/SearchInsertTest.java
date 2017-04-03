import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/4/3.
 */
public class SearchInsertTest {

    @Test
    public void searchInsert() throws Exception {
        assertEquals(2, new SearchInsert().searchInsert(new int[]{1,3,5,6},5));
        assertEquals(1, new SearchInsert().searchInsert(new int[]{1,3,5,6},2));
        assertEquals(4, new SearchInsert().searchInsert(new int[]{1,3,5,6},7));
        assertEquals(0, new SearchInsert().searchInsert(new int[]{1,3,5,6},0));
    }

}