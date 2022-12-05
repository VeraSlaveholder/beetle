package Task52;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Sum {
    public static void main(String[] args) throws IOException {
        InputStream stream;
        int result;
        stream = getStream(new byte[]{0x33, 0x45, 0x01});

        result = checkSumOfStream(stream);
        System.out.print(result);
    }

    public static InputStream getStream(byte[] data) {
        return new ByteArrayInputStream(data);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int blockSize = inputStream.read();
        while (blockSize != -1) {
            sum = (Integer.rotateLeft(sum, 1) ^ (blockSize & 0xFF));
            blockSize = inputStream.read();
        }
        return sum;
    }
}
