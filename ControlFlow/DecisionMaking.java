package ControlFlow;

public class DecisionMaking {
    public static void main(String[] args){
        int x = 10;
        // If Statement
        if(x > 0){
            System.out.println("X is Positive");
        }

        // If-Else Statement
        if(x % 2 == 0){
            System.out.println("X is Even");
        } else {
            System.out.println("X is Odd");
        }
        // Else-If Ladder
        if(x > 0){
            System.out.println("X is Positive");
        } else if(x < 0){
            System.out.println("X is Negative");
        } else {
            System.out.println("X is Zero");
        }
        // Nested If
        if(x >= 0){
            if(x == 0){
                System.out.println("X is Zero");
            } else {
                System.out.println("X is Positive");
            }
        } else {
            System.out.println("X is Negative");
        }

        // Switch Statement
        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
