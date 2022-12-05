package Task35;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{
    private byte[] a;
    public AsciiCharSequence(byte[] a){
        this.a=a;
    }

    @Override
    public int length() {
        return a.length;
    }

    @Override
    public char charAt(int index) {
        char t000 = (char)a[index];
        return t000;
    }

    @Override
    public CharSequence subSequence(int start, int end){  //Переопределение subSequence()
        return new AsciiCharSequence(Arrays.copyOfRange(a, start, end));
    }
    public String toString(){
        return new String(a, java.nio.charset.StandardCharsets.ISO_8859_1);
    }
}
