package additionally;


import java.util.function.UnaryOperator;

public class SQRT {
    public static void main(String[] args) {
        SQRT s=new SQRT();
        System.out.println( s.sqrt(7));
    }
    public Integer sqrt(int t){
        UnaryOperator<Integer> square = e -> e*e;
        return  square.apply(t);
    }
}
