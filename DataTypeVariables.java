public class DataTypeVariables {

    String title = "Java Learner"; // initialization of Instance variable
    static int year = 2021; //initialization of static variable

    public static void main(String args[]) {

        char letter = 'S'; //initialization of local variable
        DataTypeVariables obj = new DataTypeVariables(); //Accessing static variable using an objet obj
        
        System.out.println("The value of the instance variable 'title' is: " +obj.title);
        System.out.println("The value of the static variable 'year' is: " +year);
        System.out.println("The value of the local variable 'letter' is: " +letter);
    }
    
}
