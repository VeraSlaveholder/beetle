package Task61;

import java.util.Objects;

public class Pair<Integer,String> {
    private final Integer first;
    private final String second;

    private Pair(Integer first, String second) {
        this.first = first;
        this.second = second;
    }

    public Integer getFirst() {
        return this.first;
    }

    public String getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return first == pair.first && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public static <Integer, String> Pair<Integer, String> of(Integer first, String second) {
        return new Pair<>(first, second);
    }
}
