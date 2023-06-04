package stepic;

import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(sum(a,b));
    }
    private static int sum(int a,int b){
        return a+b;
    }
}
