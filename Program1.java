class English {
    void level(){
        System.out.println("Proficient");
    }
}
class Literature extends English {
    void theater(){
        System.out.println("You qualify for hollywood");
    }
}
class Art extends Literature {
    void drawing(){
        System.out.println("You are close to Leonardo Da Vinci");
    }
}
class Poetry extends Literature{
    void poem(){
        System.out.println("You are the next Shakespeare");
    }
}
public class Program1{
    public static void main (String [] args){

        System.out.println("The overall overview \n");
        Poetry p = new Poetry();
        Art a = new Art();
        a.level();
        a.drawing();
        p.theater();
        p.poem();
    }
}