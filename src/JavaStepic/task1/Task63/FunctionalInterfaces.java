package JavaStepic.task1.Task63;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return e -> condition.test(e) ? ifTrue.apply(e) : ifFalse.apply(e);
    }
}
