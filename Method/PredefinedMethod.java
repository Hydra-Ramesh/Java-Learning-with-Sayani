package Method;


public class PredefinedMethod {
    public static void main(String[] args) {
        // Using a predefined method from the Math class
        double number = Math.random();
        int roundedNumber = (int) Math.round(number * 100);
        System.out.println("Generated number: " + number);
        System.out.println("Rounded number (0-100): " + roundedNumber);
    }
}
