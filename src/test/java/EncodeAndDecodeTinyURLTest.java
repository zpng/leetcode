import org.junit.Test;

/**
 * Created by zhangpeng on 2017/4/1.
 */
public class EncodeAndDecodeTinyURLTest {

    @Test
    public void decode() throws Exception {

        EncodeAndDecodeTinyURL urlEncoder = new EncodeAndDecodeTinyURL();
        String encodedUrl = urlEncoder.encode("http://123456");
        System.out.println(encodedUrl);
        String originUrl = urlEncoder.decode(encodedUrl);
        System.out.println(originUrl);
    }

}