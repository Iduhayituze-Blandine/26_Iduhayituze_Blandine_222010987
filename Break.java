public class Break {
    public static void main(String [] args){
        int total_miles = 100; // These are the total miles of the route
        int finished_miles = 0; // This tracks the miles finished by the runners

        // We have two runners who are supposed to run different miles

        String user1_name = "Aline";
        String user2_name = "Diane";

        
        System.out.println("We have two runners in this game!");
        System.out.println("------------------------------------");
        System.out.println("Aline has to do 10 miles while Diane has to do 20 miles\n");

        // We assummed the two runners have the same running speed. 

        System.out.println("\n Race started... Goo.... \n");
        while( finished_miles < total_miles){
            finished_miles++;
            System.out.println("Miles done: " + finished_miles);
            if (finished_miles == 5){
                System.out.println(user1_name + ", "+ finished_miles +" miles done. You are halfway! Keep it up");
            }
            
            if (finished_miles == 10){
                System.out.println(user1_name + " Congragulations! You are done.");
                System.out.println(user2_name + ", "+ finished_miles +" miles done. You are halfway! Keep it up");
            }

            if (finished_miles == 20){
                System.out.println(user2_name + " Congragulations! You are done.");
                break; // This break statement helps us to stop the code as soon as the last runner is done

                /*This is because here we are only interested in two runners and we don't need to 
                 * go the whole 100 miles. 
                 */
            }
        }
        System.out.println("\nRunning workout done!\n");
    }
    
}
