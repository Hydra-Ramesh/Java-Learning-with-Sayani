package ControlFlow;

public class Loops {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 5);

        // Nested Loop
        System.out.println("\nNested Loop:");
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 2; n++) {
                System.out.println("Outer: " + m + ", Inner: " + n);
            }
        }
    }
}
