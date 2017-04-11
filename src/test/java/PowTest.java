import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/11.
 */
public class PowTest {
    @Test
    public void myPow() throws Exception {

        System.out.println(new Pow().myPow(2.33, 4));
        System.out.println(new Pow().myPow(2.33, 5));
        System.out.println(new Pow().myPow(-2.33, 4));
        System.out.println(new Pow().myPow(-2.33, 5));
        System.out.println(new Pow().myPow(2.00000, -2147483648));
    }

}