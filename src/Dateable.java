import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        int age2 = age/2 + 7;
        String result = age + "-year olds should date someone who is at least " + age2 + " years old.";
        System.out.println(result);
    }
}
