public class While1 {
    public static void main(String [] args){

        /*This program uses while loop to decide if a factory is qualified or not 
         * It will base on a condition of the factory being certified by RSB
         * RSB: Rwanda Standards Board
        */

        // Assuming that in 20, we have 4 factories that are not certified with index 4, 14, 16, 27
        // And the rest are certified.

        int i = 1; // We initialize i to 1 as an index of factory
        int totalFactories = 30;

        while(i <= totalFactories){ //it will loop through all the factories.

            if(i == 4 || i == 14 || i == 16 || i == 27){
                System.out.println("Factory with index: " + i + " is NOT certified. \n");
            }
            else{
                System.out.println("Factory with index: " + i + " is CERTIFIED. \n");
            }
            i++;    
        }
    }
    
}
