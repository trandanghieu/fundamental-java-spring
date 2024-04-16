package exceptions;

public class Ex03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // System.out.println("result: " + divide2(a, b)); // devide 0 -> AthrimeticException

        try {
            System.out.println("result: " + divide2(a, b));
        } catch (Exception e) {
           e.printStackTrace();
        }
        System.out.println("main end");

    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int divide2(int a, int b) throws ArithmeticException {
        // throws RuntimeException >> no mandatory to handle exception
        if (b == 0) {
            System.out.println("throw new");
            throw new ArithmeticException();
        }
        System.out.println("return a/b");
        return a / b;
    }

}
