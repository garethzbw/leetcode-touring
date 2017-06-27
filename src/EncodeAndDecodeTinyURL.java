import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gareth on 2017/6/27.
 */
public class EncodeAndDecodeTinyURL {

    private List<String> urls = new ArrayList<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urls.add(longUrl);
        return String.valueOf(urls.size());
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = Integer.valueOf(shortUrl);
        return index > urls.size() ? "" : urls.get(index - 1);
    }

    public static void main(String[] args) {
        EncodeAndDecodeTinyURL codec = new EncodeAndDecodeTinyURL();
        System.out.println(codec.decode(codec.encode("http://noobdota.com/foo/bar")));
    }
}
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
