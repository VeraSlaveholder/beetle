package Task53;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ReadString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        char[] buf = new char[2048];
        Reader r = new InputStreamReader(inputStream, charset);
        StringBuilder s = new StringBuilder();
        while (true) {
            int n = r.read(buf);
            if (n < 0)
                break;
            s.append(buf, 0, n);
        }
        return s.toString();
    }
}
