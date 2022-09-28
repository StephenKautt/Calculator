import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Pick The First Number: ");
        int one = in.nextInt();
        System.out.println("Pick The Second Number: ");
        int two = in.nextInt();
        System.out.println("Pick The Operator You Want To Use Add(1) Sub(2) Mult(3) Divide(4): ");
        int operator = in.nextInt();
        int answer;
        System.out.println("Your Answer Is: ");
        switch (operator){
            case 1:
                answer = one + two;
                System.out.println(answer);
                break;
            case 2:
                answer = one - two;
                System.out.println(answer);
                break;
            case 3:
                answer = one * two;
                System.out.println(answer);
                break;
            case 4:
                answer = one / two;
                System.out.println(answer);
                break;
            
        }
    }
}