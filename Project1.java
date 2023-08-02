import java.util.Scanner;

public class Project1{
    public static void main(String[] args) {
        System.out.println("Hi!!!");
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name.toUpperCase());
    }
}