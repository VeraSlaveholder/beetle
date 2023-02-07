package JavaStepic.task1.Task64;

import java.util.stream.*;

public class RandomStream {
    public static void main(String[] args) {

        pseudoRandomStream(13).limit(30).mapToObj(x->" "+x).forEachOrdered(System.out::print);

    }
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed,n->((n*n)/10)%1000);
    }
}
