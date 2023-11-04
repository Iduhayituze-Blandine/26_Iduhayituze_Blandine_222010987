public class IfStatement {
    public static void main(String [] args){
            
        /* This program checks if a person is allowed to take alcohol or not
        It bases on Rwandan restrictions of 18 years old */

        String name = "Jules";
        int ageLimit = 18;
        int age = 32;

        System.out.println("\nIs " + name + " allowed to take alcohol?");
        
        // The if statements helps us to check if Jules's age is above age limit. 

        if( age > ageLimit){
            System.out.println("Yes, " + name + " is allowed to take alcohol!");
            System.out.println("This is because " + age + " is greater than the "+ ageLimit + " age limit.\n");
        }
    }
    
}
