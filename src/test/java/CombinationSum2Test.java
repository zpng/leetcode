import org.junit.Test;

import java.util.List;

/**
 * Created by zhangpeng on 2017/4/5.
 */
public class CombinationSum2Test {
    @Test
    public void combinationSum() throws Exception {
        List<List<Integer>> results = new CombinationSum2().combinationSum2(new int[]{2, 3, 6, 7}, 7);
        System.out.println(results.toString());

    }

}