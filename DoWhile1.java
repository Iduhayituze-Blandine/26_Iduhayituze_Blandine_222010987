public class DoWhile1 {
    public static void main(String [] args){

        /* This program is going to recommend a list of school materials based on whether
         * a student is a girl or a boy. 
        */

        // Assume that we have five students Anna, John, James, Jane, Jolie

        int i = 1;

        System.out.println("\nSchool materials needed! ");
        System.out.println("------------------------------------");
        
        // We know that Anna, Jane, and Jolie are girls
        do {
            if (i == 1){
                System.out.println("\nAnna \n------ ");
            }
            else if (i == 2){
                System.out.println("\nJohn \n------  ");
            }
            else if (i== 3){
                System.out.println("\nJames \n------- ");
            }
            else if (i == 4){
                System.out.println("\nJane \n-------  ");
            }
            else if (i == 5){
                System.out.println("\nJolie \n------  ");
            }
            else{
                System.out.println("We don't know that student for sure.");
            }
            
            System.out.println(" Books \n Pens \n Soap \n Toilet Paper \n Colgate \n Toothbrush");
            if (i == 1 || i == 4 || i == 5){
                System.out.println(" Pads and \n Bras \n"); // This adds specific materials for girls
            }
            i++;
        }
        while(i <= 5) ;

        System.out.println("Thanks for checking school materials based on student gender \n");
    }
    
}
