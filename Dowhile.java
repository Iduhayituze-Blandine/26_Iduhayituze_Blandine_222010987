public class Dowhile {
    public static void main(String args[]){

        System.out.println("\n We are evaluating John's salary in relation to country's average. \n");

        // The following is John's income status based on his salary

        int salary = 200; // This is John's salary
        int c_average = 100; // This is the country's average salary

        do{

            if (salary > 500){
                System.out.println("John is a high income earner!");
            }
            else if(salary < 500 && salary > c_average){
                System.out.println("John earns a fair salary!");
            }
            else if(salary == c_average){
                System.out.println("John earns the average salary!");
            }
            else if(salary < c_average && salary > 70){
                System.out.println("John can survive but needs more money!");
            }
            else if(salary <= 70 && salary >40){
                System.out.println("Johns really needs more money!");
            }
            else{
                System.out.println("John needs aid for sure!");
            }

            break;
        } while( salary < 1000); // We assue we are comparing those with salary below 1000 only

        System.out.println("\n************************* \n");
    }     
}
