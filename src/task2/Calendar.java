package task2;

public class Calendar {
    public static void main(String[] args) {

    }
    public static int leapYearCount(int year) {
        int i = 0;
        for (int o = 1; o <= year; o++) {
            if (((o % 4 == 0) && (o % 100 != 0)) || o % 400 == 0) {
                i++;
            }
        }return i;
    }
}
