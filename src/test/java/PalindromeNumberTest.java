import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/26.
 */
public class PalindromeNumberTest {

    @Test
    public void isPalindrome() throws Exception {

        assertEquals(true, new PalindromeNumber().isPalindrome(343));
        assertEquals(true, new PalindromeNumber().isPalindrome(3443));
        assertEquals(false, new PalindromeNumber().isPalindrome(-343));
        assertEquals(false, new PalindromeNumber().isPalindrome(340));
    }

}