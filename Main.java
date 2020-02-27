import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your name: ");
        String name = scanner.nextLine(); // we know it's a `string`

        System.out.println("Your age: ");
        String age = scanner.nextLine(); // it's an integer

        System.out.println("Location: ");
        String location = scanner.nextLine(); // a string again
    }
}
