import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                int calc = number * i;
                System.out.print(String.valueOf(number)+" " + "x" + " " + String.valueOf(i) + " = "   + calc);
                System. out. println ("");
        }
        sc.close();
    }
}