package JavaStepic.task1.Task62;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            if (n % 2 != 0) {
                arrayList.add(scanner.nextInt());
            } else scanner.next();
            n++;
        }
        Collections.reverse(arrayList);

        for(int ny: arrayList){
            System.out.println(ny+" ");
        }

    }
}

