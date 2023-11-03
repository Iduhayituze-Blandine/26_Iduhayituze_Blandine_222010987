class Adder{
    public int add(int num1, int num2){
        return num1 + num2;
    }
}
public class Objects {
    public static void main(String [] args){
        //Create an instance of the Adder class

        Adder myAdder = new Adder();

        //USe the add method to add two numbers
        int result = myAdder.add(5,4);
        System.out.println("Result: " + result);
    }
}
