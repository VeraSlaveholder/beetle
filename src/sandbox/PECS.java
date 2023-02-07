package sandbox;

import java.util.ArrayList;
import java.util.List;

public class PECS {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

       // System.out.println(List1(list));
    }

    public static List<? super Number> List1(List<? super Number> list) {
        List<Number> listExample = new ArrayList<>();
        Integer count = 5;
        Number count2 = 8;
        //count2 = list.get(0);
        list.add(0);
        //count2= list.get(0);
        listExample.get(0);
        count2 = listExample.get(3);
        return listExample;
    }
}
