package additionally;

public class Box<T> {
    public static void main(String[] args) {
        Box<Integer> box=new Box<>();
        System.out.println(box.getBox());
    }
    private T object;

    public T getBox() {
        return object;
    }
}
