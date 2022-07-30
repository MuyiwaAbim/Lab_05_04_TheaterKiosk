import java.util.Scanner;
public class Main {
    static int birthMonth;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        birthMonth = sc.nextInt();
        if (birthMonth > 21) {
            System.out.println("You get a wristband.");
        }

    }
}