package JavaStepic.task1.Task62;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            queue.add(scanner.nextInt());
        }
        int size = queue.size();
        for (int i = 0; i <= size; i++) {
            if (!((i % 2) == 0)) {
                queue.remove(i);
            }
        }
        Iterator iterate_value =queue.descendingIterator();

        while (iterate_value.hasNext()) {
            System.out.print(iterate_value.next()+" ");
        }
    }
}
