public class IfElse {
    public static void main(String [] args){

        //This code checks if team is qualified for the competition based on the number of their team members. 

        int MinimumAllowed = 2;
        int NumberOfTeamMembers = 4;

        if (NumberOfTeamMembers >= MinimumAllowed){
            System.out.println("\nCongratulations! Your team is qualified \n");
        }
        else{
            System.out.println("\n We are sorry, you are below the minimum members required of a team.\n");
        }
    }
    
}
