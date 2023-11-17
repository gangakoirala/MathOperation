import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args){
        //Create a program that quizzes the user with simple addition and subtraction questions.
        //create the method that return result for addition and subtraction.
        // The program can continue asking questions,until the user decides to exit.
        //write a class and the method that ask question to the user.
        //write another method that checks for user input and exit if user type 0.

           // gives user menu to select math operation and ask question  base on the selection.
        menu();
//        String mathOperation = "+";
//        int num1 = (int)(Math.random() * 101);
//        int num2 = (int)(Math.random() * 101);
//        AskQuestion.userInput(num1,num2,mathOperation);

//        String[] mathOperation = {"+", "-", "*", "/", "%"};
//        for(int i = 0; i < mathOperation.length; ++i) {
//           AskQuestion.userInput(num1, num2, mathOperation[i]);
//        }

    }
    // gives user menu to select math operation and ask question  base on the selection.
    public static void menu(){
        String checkInput;
        do {
            System.out.println("Please select 1-5 from the following math operation.");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulus");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            checkInput = scanner.nextLine();

            int num1 = (int) (Math.random() * 101);
            int num2 = (int) (Math.random() * 101);
            switch (checkInput) {
                case "0":
                    System.out.println("Good bye!");
                    break;
                case "1":
                    AskQuestion.userInput(num1, num2, "+");
                    break;
                case "2":
                    AskQuestion.userInput(num1, num2, "-");
                    break;
                case "3":
                    AskQuestion.userInput(num1, num2, "*");
                    break;
                case "4":
                    AskQuestion.userInput(num1, num2, "/");
                    break;
                case "5":
                    AskQuestion.userInput(num1, num2, "%");
                    break;
                default:
                    System.out.println("Incorrect selection");
            }
        } while (!checkInput.equals("0"));
    }
}
