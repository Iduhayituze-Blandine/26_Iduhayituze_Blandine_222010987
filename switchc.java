public class switchc {
    public static void main(String args[]){
        int zipcode = 90877;

        switch(zipcode){
            case 98464: System.out.println("You live in Uganda");
            break;
            
            case 84747: System.out.println("You live in Tanzania");
            break;
            
            case 37474: System.out.println("You live in Burundi");
            break;

            case 83748: System.out.println("You live in Kenya");
            break;

            case 98983: System.out.println("You live in Congo");
            break;

            case 82211: System.out.println("You live in Congo");
            break;

            case 90877: System.out.println("Ooh! You live in Rwanda.");
            break;

            default: System.out.println("Zip code not recognized in EAC");
        }
    }
    
}
