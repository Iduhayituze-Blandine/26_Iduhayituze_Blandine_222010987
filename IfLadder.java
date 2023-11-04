public class IfLadder{
    public static void main (String [] args){

        // This program checks if a person has age allowed for the army

        int MinimumAge = 18;
        int MaximumAge = 27;
        int PersonAge = 24;
        
        System.out.println("\n \t Welcome to your dashboard! Let's check if you are qualified. \t");
        System.out.println("----------------------------------------------------------------------------------\n");

        if(PersonAge == MinimumAge){
            System.out.println("Congratulations!");
            System.out.println("This is a great start, you are going to start serving your country at a young age.");
        }
        else if(PersonAge < MinimumAge){
            System.out.println("We are sorry, you are below the minimum age allowed!");
            System.out.println("Welcome anytime when you get older.");
        }
        else if(PersonAge > MaximumAge){
            System.out.println("We are sorry you are above the maximum age allowed!");
            System.out.println("Try other means of serving our country.");
        }
        else if (PersonAge == MaximumAge){
            System.out.println(" OMG! Congratulations! You are on the edge.");
            System.out.println("You wouldn't be qaulified by next year");
        }
        else{
            System.out.println("Congratulations! You are just in the range we want!");
        }

        System.out.println("Thank you for checking if you are qualified.");
        System.out.println("We wish you all the best");
        System.out.println("\n**********************************************************************************");
    }
}