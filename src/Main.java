import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("what is your name ?");
    String name = scanner.nextLine();

        System.out.println("what is your age ?");
    int age = scanner.nextInt();

    System.out.println(age);

    }
}