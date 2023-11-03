class P1 {
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
        
        System.out.println("Welcome to the Automated Quiz Generator!");
        
        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            // Assume user's answer is taken from user input (not shown here)
            String userAnswer = "Paris"; // Example user answer for the first question
            
            if (userAnswer.equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswers[i]);
            }
        }
        
        System.out.println("\nQuiz Complete!");
        System.out.println("You answered " + score + " out of " + numberOfQuestions + " questions correctly.");
    }
}
