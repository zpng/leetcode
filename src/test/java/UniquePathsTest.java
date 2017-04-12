import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/4/12.
 */
public class UniquePathsTest {

    @Test
    public void uniquePaths() throws Exception {

        assertEquals(1, new UniquePaths().uniquePaths(3, 1));
        assertEquals(1, new UniquePaths().uniquePaths(1, 3));
        assertEquals(2, new UniquePaths().uniquePaths(2, 2));
        assertEquals(3, new UniquePaths().uniquePaths(3, 2));
        System.out.println(new UniquePaths().uniquePaths(3, 7));
        System.out.println(new UniquePaths().uniquePaths(7, 7));
        System.out.println(new UniquePaths().uniquePaths2(50, 50));
        System.out.println(new UniquePaths().uniquePaths2(100, 100));
    }

}