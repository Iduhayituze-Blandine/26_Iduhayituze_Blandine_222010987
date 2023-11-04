class While {
    public static void main(String [] args){

        // THIS PROJECT HELPS US DECIDE IF THE STUDENT HAS PASSED, HAVE RETAKES, or IS REPEATING

        /*  Suppose we have a group of students with different number of repeat credits
        We have FOUR students in this assessment  with those cases, number 12, 23, 30, and 4*/

        int total_students = 30;
        int repeat_credits;
        int student_number = 1;

        System.out.println("\nWelcome to your DASHBOARD!");
        System.out.println("--------------------------------\n");
        while (student_number <= total_students){
            System.out.println("Student with student number " + student_number + ", result: ");

            if (student_number == 12 ){
                repeat_credits = 10;
                student_number++;
                if (repeat_credits <= 0){
                    System.out.println("Pass \n");
                }
                else if (repeat_credits <= 30 ){
                    System.out.println("Pass with retakes\n");
                }
                else{
                    System.out.println("Sorry! You are repeating the year\n");
                }
            }

            else if (student_number == 23 ){
                repeat_credits = 20;
                student_number++;
                if (repeat_credits <= 0){
                    System.out.println("Pass\n");
                }
                else if (repeat_credits <= 30 ){
                    System.out.println("Pass with retakes\n");
                }
                else{
                    System.out.println("Sorry! You are repeating the year\n");
                }
            }

            else if (student_number == 30){
                repeat_credits = 15;
                student_number++;
                if (repeat_credits <= 0){
                    System.out.println("Pass\n");
                }
                else if (repeat_credits <= 30 ){
                    System.out.println("Pass with retakes\n");
                }
                else{
                    System.out.println("Sorry! You are repeating the year\n");
                }
            }
            else if (student_number == 4){
                repeat_credits = 35;
                student_number++;
                if (repeat_credits <= 0){
                    System.out.println("Pass\n");
                }
                else if (repeat_credits <= 30 ){
                    System.out.println("Pass with retakes\n");
                }
                else{
                    System.out.println("Sorry! You are repeating the year\n");
                }
            }
            else{
                repeat_credits = 0;
                student_number++;
                if (repeat_credits <= 0){
                    System.out.println("Pass\n");
                }
                else if (repeat_credits <= 30 ){
                    System.out.println("Pass with retakes\n");
                }
                else{
                    System.out.println("Sorry! You are repeating the year\n");
                }
            }             
        }
        System.out.println("\nThanks for your time! \n");
        System.out.println("******************************************");
    }
}
