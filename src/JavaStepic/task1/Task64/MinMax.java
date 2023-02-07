package JavaStepic.task1.Task64;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMax {
    public static void main(String[] args) {
        findMinMax(
                Stream.of(9, 6, 8, 3, 19, 16, 18, 13),
                Integer::compareTo,
                (v1, v2) -> System.out.println("max = " + v2 + "\nmin = " + v1)
        );
    }
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> items = stream.sorted(order).collect(Collectors.toList());
        if (!items.isEmpty()) {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));
        } else minMaxConsumer.accept(null, null);
    }
}

