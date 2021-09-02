import java.sql.SQLOutput;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello! What's your name? ");
        String name = scan.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("What about your favorite ice cream flavor?");
        String icecream = scan.nextLine();
        if(icecream.equals("Vanilla")||icecream.equals("vanilla")) {
            System.out.println("Wow! Me too!");
        }
        else {
            System.out.println("Cool, though I would go for vanilla over " + icecream + " any day.");
        }
        System.out.println("Speaking of food, what did you eat for breakfast this morning?");
        String breakfast = scan.nextLine();
        System.out.println(breakfast + "? That's a good one.");
        System.out.println("By the way, what is your favorite whole number?");
        int number = scan.nextInt();
        System.out.println("Nice. My favorite number is " + (number+10) + ", which is kinda close to yours!");
        String h = scan.nextLine();
        System.out.println("Before you leave, what is your favorite class?");
        String course = scan.nextLine();
        System.out.println("I agree. " + course + " is very fun to take. Bye!");
        scan.close();
    }
}
