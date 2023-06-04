package stepic;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b=in.nextInt();
        int[] list = new int[a + 1];
        list[0] = 0;
        if (a == 0) {
            System.out.println(0);
        } else {
            list[1] = 1;
            for (int i = 2; i < list.length; i++) {
                list[i] =list[i - 1] + list[i - 2];
            }
            System.out.println(mod(list[a],b));
        }
    }
    public static int mod(int num1,int num2){
        return num1%num2;
    }
}
