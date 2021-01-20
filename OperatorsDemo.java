//package demo-repo;

public class OperatorsDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Given num1 = " +num1 + " & num2 = " +num2);

        System.out.println("Examples of Arithmetic Operators:");
        System.out.println("The addition of " +num1 + " and " +num2 + " is "  +(num1 + num2));
        System.out.println("The substraction of " +num1 + " from " +num2 + " is "  +(num2 - num1));
        System.out.println("The multiplication of " +num1 + " and " +num2 + " is "  +(num1 * num2));

        System.out.println("Examples of Auto-increment and Auto-decrement Operators:");
        num1++;
        num2--;
        System.out.println("num1++ is "  + num1);
        System.out.println("num2-- is "  + num2);
    
    }
    
}
