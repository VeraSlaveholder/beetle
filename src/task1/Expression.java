package task1;

public class Expression {

        public static void main(String[] args) {
        }

        public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
            return (!a & !b & c & d)
                    | (!a & b & !c & d)
                    | (!a & b & c & !d)
                    | (a & !b & !c & d)
                    | (a & !b & c & !d)
                    | (a & b & !c & !d);
        }
}

