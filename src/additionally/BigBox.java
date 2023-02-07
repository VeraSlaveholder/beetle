package additionally;

public class BigBox {
    public static class Box<T>{
        private T object;
        public static <T> Box<T> getBox() {return new Box<>(); }
    }
}
