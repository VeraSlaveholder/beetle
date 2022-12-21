package additionally;


public class NumberGenerators {
    public static void main(String[] args) {
        Double as=-5.5;
        System.out.println( getGenerator().cond(as));
    }
    public static NumberGenerator<? super Number> getGenerator() {
        return x -> (x.intValue() > 0);
    }
}

interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}