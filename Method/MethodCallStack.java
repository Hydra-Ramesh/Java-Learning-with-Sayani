package Method;

public class MethodCallStack {
    public static void fourthMethod(){
        int d = 40;
        System.out.println("Inside Fourth Method");
        System.out.println("Value of d: " + d);
    }
    public static void thirdMethod(){
        int c = 30;
        fourthMethod();
        System.out.println("Inside Third Method");
        System.out.println("Value of c: " + c);
    }
    public static void secondMethod(){
        int b = 20;
        thirdMethod();
        System.out.println("Inside Second Method");
        System.out.println("Value of b: " + b);
    }
    public static void firstMethod(){
        int a = 10;
        secondMethod();
        System.out.println("Inside First Method");
        System.out.println("Value of a: " + a);
    }
    public static void main(String[] args) {
        firstMethod();
        fourthMethod();
    }
}
