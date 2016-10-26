/**
 * Created by jimyth on 2016/10/26.
 */

import java.nio.charset.Charset;
public class testEncod {


        public static void main(String[] args) {

            System.out.println(System.getProperty("file.encoding"));
            System.out.println(Charset.defaultCharset().name());
        }
}
