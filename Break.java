public class Break {
    public static void main(String [] args){
        int total_miles = 100;
        int finished_miles = 0;

        String user1_name = "Aline";
        String user2_name = "Diane";

        // Assume we have a runner

        System.out.println("We have two runners in this game!");
        System.out.println("------------------------------------");
        System.out.println("Aline has to do 10 miles while Diane has to do 20 miles\n");

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
                break;
            }
        }
        System.out.println("Running workout done!");
    }
    
}
