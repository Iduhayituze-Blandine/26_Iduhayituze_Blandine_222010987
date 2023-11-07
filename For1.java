public class For1 {
    public static void main(String [] args){
        // This program counts days in a month 

        for(int i = 1; i <= 12; i++){

            String month = " "; // Initialize month with an empty string
            int daysInMonth = 0; // Initialize days in a month with 0

            switch(i){    // The switch case helps us compare i and name the month corresponding to an i
                case 1: 
                    month = "January";
                    daysInMonth = 31;
                break;
                case 2: 
                    month = "February";
                    daysInMonth = 28;
                break;
                case 3: 
                    month = "March";
                    daysInMonth = 31;
                break;
                case 4: 
                    month = "April";
                    daysInMonth = 30;
                break;
                case 5: 
                    month = "May";
                    daysInMonth = 31;
                break;
                case 6: 
                    month = "June";
                    daysInMonth = 30;
                break;
                case 7: 
                    month = "July";
                    daysInMonth = 31;
                break;
                case 8: 
                    month = "August";
                    daysInMonth = 31;
                break;
                case 9: 
                    month = "September";
                    daysInMonth = 30;
                break;
                case 10: 
                    month = "October";
                    daysInMonth = 31;
                break;
                case 11: 
                    month = "November";
                    daysInMonth = 30;
                break;
                case 12: 
                    month = "December";
                    daysInMonth =31;
                break;
            }
           
            System.out.println("Month: "+ month ); // Outputs the month 

            for(int j = 1; j <= daysInMonth; j++){ // This for loop, loops all days in a month
                System.out.println(j);
            }

            System.out.println(""); //This helps us put a space to separate one month and the other
        }
    }
    
}
