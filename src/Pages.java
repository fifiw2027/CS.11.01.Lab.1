import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        int page = 100 - age;
        String pageToString = "" + page;
        String result = age + "-year olds should read at least " + page + " pages before giving up on the book.";
        System.out.println(result);
    }
}
