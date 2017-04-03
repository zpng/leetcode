import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/4/3.
 */
public class IsValidSudokuTest {

    @Test
    public void isValidSudoku() throws Exception {
        char[][] sudo =
                {".87654321".toCharArray(), "2........".toCharArray(), "3........".toCharArray(),
                        "4........".toCharArray(), "5........".toCharArray(),
                        "6........".toCharArray(), "7........".toCharArray(),
                        "8........".toCharArray(), "9........".toCharArray()};
        assertEquals(true, new IsValidSudoku().isValidSudoku(sudo));
    }

}