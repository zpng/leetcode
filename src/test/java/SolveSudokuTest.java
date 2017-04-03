import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/4/3.
 */
public class SolveSudokuTest {

    @Test
    public void solveSudoku() throws Exception {

        char[][] sudo =
                {".87654321".toCharArray(), "2........".toCharArray(), "3........".toCharArray(),
                        "4........".toCharArray(), "5........".toCharArray(),
                        "6........".toCharArray(), "7........".toCharArray(),
                        "8........".toCharArray(), "9........".toCharArray()};
        new SolveSudoku().solveSudoku(sudo);
        System.out.println(Arrays.deepToString(sudo));
    }

}