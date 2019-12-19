import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
public class QuestionsAndAutoGrader
{
    public static void main(String[] args)
    {
    	int AmountOfQuestions = 5;
    	//Change for amount of questions you have
        System.out.println("Question 1: ...");
        String userAnswerOne = scanner.nextInt();
        int answerOne = 17;
        //Do whatever answer you choose
        if (userAnswerOne == answerOne){
        System.out.println("Correct! Onto the next one");
        int grade = 1;
        } else {
        System.out.println("Wrong! You still got 4 more!");
        }
        System.out.println("Question 2: ...");
        String userAnswerTwo = scanner.nextInt();
        int answerTwo = 2;
        //Do whatever answer you choose
        if (userAnswerTwo == answerTwo){
        System.out.println("Correct! Onto the next one");
        int grade = 2;
        } else {
        System.out.println("Wrong! You still got 3 more!");
        }
        System.out.println("Question 3: ...");
        String userAnswerThree = scanner.nextInt();
        int answerThree = 101;
        //Do whatever answer you choose
        if (userAnswerThree == answerThree){
        System.out.println("Correct! Onto the next one");
        int grade = 3;
        } else {
        System.out.println("Wrong! You still got 2 more!");
        }
        System.out.println("Question 4: ...");
        String userAnswerTwo = scanner.nextInt();
        int answerFour = 12;
        //Do whatever answer you choose
        if (userAnswerFour == answerFour){
        System.out.println("Correct! Onto the next one");
        int grade = 4;
        } else {
        System.out.println("Wrong! You still got 1 more!");
        }
        System.out.println("Question 5: ...");
        String userAnswerFive = scanner.nextInt();
        int answerFive = 123;
        //Do whatever answer you choose
        if (userAnswerFive == answerFive){
        System.out.println("Correct! Onto the next one");
        int grade = 5;
        } else {
        System.out.println("Wrong!");
        }
        System.out,println("Your Score is: " + score + "/" + AmountOfQuestions);
    }
}