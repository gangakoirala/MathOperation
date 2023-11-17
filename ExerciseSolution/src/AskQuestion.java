import java.util.Scanner;

public class AskQuestion {
    public static void userQuestions(int answer,double decimal,double answer2, int solution,int num1, int num2, String symbol){
//        int num1 = (int)(Math.random() * 101);
//        int num2 = (int)(Math.random() * 101);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please solve the following equation or type '0' to exit");
//        System.out.println(num1 + " + " + num2 + " = "  );
//        int answer = scanner.nextInt();
//        int solution = ReturnResult.addition(num1,num2);

            if (answer == solution && !symbol.equals("/")) {
                System.out.println("It's correct answer!");
//                 num1 = (int)(Math.random() * 101);
//                 num2 = (int)(Math.random() * 101);
//                userInput(num1, num2, symbol);
            } else if (decimal == answer2 && symbol.equals("/")){
                System.out.println("It's correct answer!");
            } else {
                System.out.println("Sorry! It's wrong answer, try again.");
                userInput(num1, num2, symbol);
            }
    }
    public static void userInput(int num1, int num2, String mathOperation){
        int solution = 0;

//        int num1 = (int)(Math.random() * 101);
//        int num2 = (int)(Math.random() * 101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please solve the following equation.");
        System.out.print(num1 + " " + mathOperation + " " + num2 + " = "  );
        String answer = scanner.nextLine();
        int answer2 = 0;
        double decimal = 0;
        double solution2 = 0;
        if(mathOperation.equals("+")) {
            answer2 = Integer.parseInt(answer);
            solution = ReturnResult.addition(num1, num2);
        } else if(mathOperation.equals("-")){
            answer2 = Integer.parseInt(answer);
            solution = ReturnResult.subtraction(num1,num2);
        } else if(mathOperation.equals("*")){
            answer2 = Integer.parseInt(answer);
            solution = ReturnResult.multiplication(num1,num2);
        } else if(mathOperation.equals("/")){
            decimal = Double.parseDouble(answer);
            solution2 = ReturnResult.division(num1,num2);
        } else {
            answer2 = Integer.parseInt(answer);
            solution = ReturnResult.modulus(num1,num2);
        }
        userQuestions(answer2,decimal,solution2,solution,num1,num2,mathOperation);
       }
    }

