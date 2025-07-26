import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("CALCULATOR");
        System.out.println("Enter first No.");
        int A=sc.nextInt();
        System.out.println("Enter Second No.");
        int B=sc.nextInt();
        System.out.println("Enter Operation(+ - * / )");
        char choice=sc.next().charAt(0);
        switch(choice){
            case '+':System.out.println(A+B);
            break;
            case '-':System.out.println(A-B);
                break;
            case '*':System.out.println(A*B);
                break;
            case '/':System.out.println(A/B);
                break;
                default:System.out.print("Invalid Opeator");

        }




    }

}
