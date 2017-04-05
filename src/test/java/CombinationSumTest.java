import org.junit.Test;

import java.util.List;

/**
 * Created by zhangpeng on 2017/4/5.
 */
public class CombinationSumTest {
    @Test
    public void combinationSum() throws Exception {
        List<List<Integer>> results = new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(results.toString());
    }

}