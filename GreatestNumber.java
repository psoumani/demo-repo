public class GreatestNumber {

    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int c = 12;
        int result; 
        
        result = greatest(a, b, c);

        System.out.println("The greatest number between " +a + " , " +b + 
                " and " +c + " is " +result);
        
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
        return result;

    }

}
