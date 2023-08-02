import java.util.Scanner;

public class Project1{
    public static void main(String[] args) {
        System.out.println("Hi!!!");
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your birth country: ");
        String bcountry = scanner.nextLine();
        if (age < 13){
            System.out.println("Hello, little " + name.toUpperCase() + " from " + bcountry.toUpperCase());
        } else if (age >= 13 && age <20){
            System.out.println("Hello young " + name.toUpperCase() + " from " + bcountry.toUpperCase());
        }
    }
}