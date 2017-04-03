import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/4/3.
 */
public class SearchRangeTest {

    @Test
    public void searchRange() throws Exception {
        System.out.println(Arrays.toString(new SearchRange().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

}