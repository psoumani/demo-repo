public class GreatestNumber {

    public static void main(String[] args) {
        int a = 8;
        int b = 16;
        int c = 12;
        
        greatest(a, b, c);
    }
    
    public static int greatest(int num1, int num2, int num3) {

        int result;

        if ((num1>num2) && (num1>num3)) {
            result = num1;
        }
        else if ((num2>num1) && (num2>num3)) {
            result = num2;
        }
        else {
            result = num3;
        }

        System.out.println("The greatest number between " +num1 + " , " +num2 + 
                " and " +num3 + " is " +result);

        return result;
    }
}
