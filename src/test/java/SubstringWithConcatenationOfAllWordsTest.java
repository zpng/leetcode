import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/1.
 */
public class SubstringWithConcatenationOfAllWordsTest {
    @Test
    public void findSubstring() throws Exception {
//        System.out.println(new SubstringWithConcatenationOfAllWords().findSubstring("barfoothefoobarman", new
//                String[]{"foo", "bar"}));
        System.out.println(new SubstringWithConcatenationOfAllWords().findSubstring("wordgoodgoodgoodbestword", new
                String[]{"word", "good", "best", "good"}));
    }

}