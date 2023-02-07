package additionally;

public class DynamicArray<T> {

    private T[] array;
    private int size;

    public DynamicArray() {
        T[] arr = (T[]) new Object[10];
    }

    private int isIndexExists(int index) {
        if (index > array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return index;
    }

    private T[] increaseCapasity() {
        T[] temp = (T[]) new Object[(array.length * 2)];
        System.arraycopy(array, 0, temp, 0, array.length);
        return temp;
    }

    public void add(T el) {
        if (array.length == size) {
            array = increaseCapasity();
        }
        array[size] = el;
    }

    public void remove(int index) {
        isIndexExists(index);
        T[] temp = array;
        array = (T[]) new Object[temp.length - 1];

        System.arraycopy(array, 0, temp, 0, index);
        System.arraycopy(array, index + 1, temp, index, temp.length - index - 1);
        size--;
    }

    public T get(int index) {
        isIndexExists(index);
        return array[index];
    }
}
