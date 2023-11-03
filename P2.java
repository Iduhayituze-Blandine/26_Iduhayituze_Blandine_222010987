class P2 {

    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal in the world?",
            "Who painted the Mona Lisa?"
        };
        
        String[] correctAnswers = {
            "Paris",
            "Mars",
            "Blue Whale",
            "Leonardo da Vinci"
        };
        
        int numberOfQuestions = questions.length; // Number of questions in the quiz
        int score = 0;
        int questionIndex = 0;
        
        System.out.println("Welcome to the Automated Quiz Generator!");
        
        while (questionIndex < numberOfQuestions) {
            System.out.println("Question " + (questionIndex + 1) + ": " + questions[questionIndex]);
            // Assume user's answer is taken from user input (not shown here)
            String userAnswer = "Paris"; // Example user answer for the first question
            
            if (userAnswer.equalsIgnoreCase(correctAnswers[questionIndex])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswers[questionIndex]);
            }
            
            questionIndex++;
            
            if (questionIndex < numberOfQuestions) {
                System.out.print("Next question? (yes/no): ");
                // Assume user's choice is taken from user input (not shown here)
                String choice = "yes"; // Example user choice
                
                if (!choice.equalsIgnoreCase("yes")) {
                    break; // Exit the loop if the user does not want to continue
                }
            }
        }
        
        System.out.println("\nQuiz Complete!");
        System.out.println("You answered " + score + " out of " + numberOfQuestions + " questions correctly.");
    }
}
