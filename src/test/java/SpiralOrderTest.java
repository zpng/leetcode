import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/11.
 */
public class SpiralOrderTest {

    @Test
    public void spiralOrder() throws Exception {
        System.out.println(new SpiralOrder().spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));
    }

}