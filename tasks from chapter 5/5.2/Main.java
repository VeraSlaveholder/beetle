package Task52;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int nextValue=0;
        int value = System.in.read();
        while (value != -1) {
            nextValue = System.in.read();
            if (value != 13 || nextValue != 10) {
                System.out.write(value);
            }
            value = nextValue;
        }
        System.out.flush();
    }
}

