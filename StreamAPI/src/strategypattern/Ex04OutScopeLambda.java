package strategypattern;

import bean.Apple;

public class Ex04OutScopeLambda {

    public static void main(String[] args) {
        int time = 3000;
        Runnable runnable = running(time);
        runnable.run();

    }

    // closure funtion là 1 anonymous class có chứa funtion, funtion có th chứa biến trong outer scope và truy cập chúng, và các biến ngầm hiểu là final
    public static Runnable running(int time) {
        //lexical scope
        // local variable
        // outer scope
        String name = "Tran Dang Hieu";
        Apple apple = new Apple(9,"Green",200d,"Vietnam");

        return new Runnable() {
            //closure function: can reference to outer scope variables
            // even those variables are clear after finish outer function
            // non-local- outer variable are explicitly final(ngầm định là biến final)
            // Hàm run là 1 closure function
            @Override
            public void run() {
                //local variable
                // inner scope
                int time = 2000;
                System.out.println("Name: " + name + " is running " + time);
                System.out.println("Apple country: " + apple.getCountry());
            }
        };
    }


}
