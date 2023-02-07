package JavaStepic.task1.Task41;

public class Test {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        String message = null;
        if (stackTraceElements.length >= 3) {
            StackTraceElement element = stackTraceElements[2];
            message = element.getClassName() + "#" + element.getMethodName();
        }
        return message;
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();
    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();
    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();
    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());
    }
}
