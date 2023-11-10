class Maths implements Subject{
    public int Quiz(int m_quiz){
        return m_quiz;
    }
    public int CAT(int m_CAT){
        return m_CAT;
    }
    public int Exam(int m_exam){
        return m_exam;
    }  
}

class Engl implements Subject{
    public int Quiz(int e_quiz){
        return e_quiz;
    }
    public int CAT(int e_CAT){
        return e_CAT;
    }
    public int Exam(int e_exam){
        return e_exam;
    }
}

class Science implements Subject{
    public int Quiz(int s_quiz){
        return s_quiz;
    }
    public int CAT(int s_CAT){
        return s_CAT;
    }
    public int Exam(int s_exam){
        return s_exam;
    }
}

class Comp implements Subject{
    public int Quiz(int c_quiz){
        return c_quiz;
    }
    public int CAT(int c_CAT){
        return c_CAT;
    }
    public int Exam(int c_exam){
        return c_exam;
    }
}

class Arts implements Subject{
    public int Quiz(int a_quiz){
        return a_quiz;
    }
    public int CAT(int a_CAT){
        return a_CAT;
    }
    public int Exam(int a_exam){
        return a_exam;
    }
}

public class Program2 {
    public static void main(String [] args){

        System.out.println("\nYEAR 1 TRANSCRIPT \t\t");
        System.out.println("-----------------\t\t");
        System.out.println("Names: Blandine Iduhayituze");
        System.out.println("Reg. Number: 222010987 \n");

        System.out.println("-----------------------------");
        System.out.println("Subj|\tQuiz|\tCAT |\tExam|");
        System.out.println("-----------------------------");

        Subject [] subjects = {new Maths(), 
                            new Engl(),
                            new Science(),
                            new Comp(),
                            new Arts()} ;

        for(int i = 0; i < subjects.length; i++){

            if (i == 0){
            System.out.print("Math|\t");
            System.out.print(subjects[i].Quiz(17) + "  |\t");
            System.out.print(subjects[i].CAT(24) + "  |\t");
            System.out.print(subjects[i].Exam(43) + "  |\t");
            }
            else if (i == 1){
            System.out.print("Engl|\t");
            System.out.print(subjects[i].Quiz(18) + "  |\t");
            System.out.print(subjects[i].CAT(29) + "  |\t");
            System.out.print(subjects[i].Exam(47) + "  |\t");
            }
            else if(i == 2){
            System.out.print("Scie|\t");
            System.out.print(subjects[i].Quiz(16) + "  |\t");
            System.out.print(subjects[i].CAT(25) + "  |\t");
            System.out.print(subjects[i].Exam(50) + "  |\t");
            }
            else if(i == 3){
            System.out.print("Comp|\t");
            System.out.print(subjects[i].Quiz(19) + "  |\t");
            System.out.print(subjects[i].CAT(22) + "  |\t");
            System.out.print(subjects[i].Exam(40) + "  |\t");
            }
            else if(i == 4){
            System.out.print("Arts|\t");
            System.out.print(subjects[i].Quiz(14) + "  |\t");
            System.out.print(subjects[i].CAT(25) + "  |\t");
            System.out.print(subjects[i].Exam(50) + "  |\t");
            }
            else{
                System.out.println("Check your codes, You might be having an error.");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.println("\nApproved by \nHOD BIT Dr. Rugema \n");
         
    }
    
}
