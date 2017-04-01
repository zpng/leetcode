import org.junit.Test;

import java.util.Arrays;

/**
 * Created by zhangpeng on 2017/4/1.
 */
public class NextPermutationTest {


    @Test
    public void nextPermutation() throws Exception {
        int[] nums = new int[]{1, 3, 2};
        new NextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

}