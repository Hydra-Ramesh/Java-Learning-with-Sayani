package Method;

public class StaticMethod {
    public static void greet(){
        System.out.println("Hello, welcome to static methods!");
    }
    public static void main(String[] args) {
        greet();
        StaticMethod.greet();
    }
}
