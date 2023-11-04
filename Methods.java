public class Methods {

    // Here we create a method called addNumbers
    public static int addNumbers (int num1, int num2){
        return num1 + num2;
    }

    public static void main(String [] args){
        int number1 = 5;
        int number2 = 7;

        // We call the method 'addNumbers' to use it in our calculation
        int results = addNumbers(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + results);
    }
    
}
