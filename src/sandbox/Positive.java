package sandbox;

import java.util.Arrays;

public class Positive{

    public static void main(String[] args) {
        int arr[]={1,9,-1};
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr){
        int sum= Arrays.stream(arr).filter(i->i>0).sum();
        return sum;
    }

}