
public class For {
    public static void main(String [] args){
        int total_days = 15;
        int marks_per_day = 5;
        int total_marks = 0;

        // This project is going to assume one attendance equals 5 marks
        // It will then calculate the total marks of a student's attendance

        int attended_days = 13; // We assume the student attended 13 days

        for(int i = 1; i <= total_days; i++){

            if (i <= attended_days){
                System.out.println("Day " + i + ": attended");
                total_marks += marks_per_day;
            }
            else{
                System.out.println("Day " + i + ": absent");
            }
        }

        System.out.println("Each day counts for 5 marks \n");
        System.out.println("This student attended " + attended_days + " days out of " + total_days + " days.");
        System.out.println("Total Marks: " + total_marks);
        System.out.println("\nThanks for tracking the attendance.");
        System.out.println("********\n");
    }
}
