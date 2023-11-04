public class NestedLoop {
    public static void main(String a[]){
        int weeks = 4;
        int days = 7;
        
        System.out.println("\nBudget of the month");
        System.out.println("**********************");
        for(int w = 1; w <= weeks; w++){ // This loops the 4 weeks that each month has

            /*This program helps us budget for the month, assuming that we have certain types of food
             * we buy over the weekend and ones we buy over the weedays. 
             */

            System.out.println("\n\nWeek: " + w);
            System.out.println("------------");
            for (int d = 1; d <= days; d++){ // This loops for the seven days in a week
                
                System.out.println("\nDay: " + d);
                System.out.println("Groceries of today");

                if (d == 6 || d == 7){ 
                    System.out.println("Milk, water, juice"); // We buy those only over the weekend
                }
                else{
                    System.out.println("Potatoes, veggies, fruits"); // We buy those over the weekdays
                }
            }
        }

        System.out.println("\n");
    }   
}
