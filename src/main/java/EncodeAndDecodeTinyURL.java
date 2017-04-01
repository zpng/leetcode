/**
 * @(#)EncodeAndDecodeTinyURL.java, 四月 01, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangpeng
 */
public class EncodeAndDecodeTinyURL {

    private List<String> urls = new ArrayList<String>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {

        urls.add(longUrl);
//        return Integer.valueOf(urls.size()-1).toString();
        return Integer.toString(urls.size() - 1, 62);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        int index = Integer.valueOf(shortUrl, 62);
        return index < urls.size() ? urls.get(index) : "";
    }

    //todo 怎么转成62进制的?
}