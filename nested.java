public class nested {
    public static void main(String a[]){
        int weeks = 4;
        int days = 7;
        
        System.out.println("\nBudget of the month");
        System.out.println("**********************");
        for(int w = 1; w <= weeks; w++){

            System.out.println("\n\nWeek: " + w);
            System.out.println("------------");
            for (int d = 1; d <= days; d++){
                
                System.out.println("\nDay: " + d);
                System.out.println("Groceries of today");

                if (d == 6 || d == 7){
                    System.out.println("Milk, water, juice");
                }
                else{
                    System.out.println("Potatoes, veggies, fruits");
                }
            }
        }
    }
}
