import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/4/12.
 */
public class GenerateMatrixTest {

    @Test
    public void generateMatrix() throws Exception {
        System.out.println(Arrays.deepToString(new GenerateMatrix().generateMatrix(3)));
        System.out.println(Arrays.deepToString(new GenerateMatrix().generateMatrix(4)));
    }

}