package stepic;

import java.util.Arrays;
import java.util.Scanner;

public class Backpack {
    public static void main(String[] args) {
        System.out.println(new Backpack().thief());
    }

    public double thief() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        double result = 0;
        Item[] item = new Item[n];
        for (int i = 0; i < item.length; i++) {
            item[i] = new Item(scanner.nextInt(), scanner.nextInt());
        }
        Arrays.sort(item);
        for (Item it : item) {
            if (it.volume <= w) {
                result += it.price;
                w -= it.volume;
            } else {
                result += (double)( it.price* w / it.volume );
                break;
            }
        }
        return result;
    }


    class Item implements Comparable<Item> {
        int price;
        int volume;

        public Item(int price, int volume) {
            this.price = price;
            this.volume = volume;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "price=" + price +
                    ", volume=" + volume +
                    '}';
        }

        @Override
        public int compareTo(Item o) {
            int res1 = price * o.volume;
            int res2 = o.price * volume;
            return Integer.compare( res2,res1);
        }
    }
}
