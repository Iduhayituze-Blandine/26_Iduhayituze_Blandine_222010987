class Mathematics{
    int math_marks (int quiz, int test, int exam){
        return quiz + test + exam;
    }
}
class Science extends Mathematics {
    void experiments(int chem, int bios, int phy){
    }
}
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
        Science s = new Science();
        Poetry p = new Poetry();
        Art a = new Art();
        a.level();
        a.drawing();
        p.theater();
        p.poem();
        s.experiments(45, 47, 34);
        s.math_marks(20, 30, 40);
    }
}