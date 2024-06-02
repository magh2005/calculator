import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("calculator started plz enter variables: ");
        Scanner in = new Scanner(System.in);
        double answer = in.nextDouble();

        char operator;
        double num;
        operator = in.next().charAt(0);
        switch (operator) {
            case '=': 
                System.out.println(answer);
                break;
            case '+':
                num = in.nextDouble();
                answer += num;
                operator = in.next().charAt(0);
                break;
            case '-' :
                num = in.nextDouble();
                answer -= num;
                operator = in.next().charAt(0);
                break;
            case '*':
                num = in.nextDouble();
                answer *= num;
                operator = in.next().charAt(0);
                break;
            case '/' :
                num = in.nextDouble();
                answer /= num;
                operator = in.next().charAt(0);
                break;
            default:
                System.out.println("Error");
                break;
        }
        in.close();
        System.out.println(answer);
    }
}
