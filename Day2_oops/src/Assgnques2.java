import java.util.Scanner;
public class Assgnques2 {
    public static void main(String[] args) {
        String Uppercase, Lowercase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name/word/statement in Lowercase");
        Lowercase=sc.nextLine();
        Uppercase =Lowercase.toUpperCase();
        System.out.println("The uppercase equivalent of " + Lowercase + " is " + Uppercase);
        System.out.println("\n");
        System.out.println("Enter a name/word/statement in Uppercase");
        Uppercase = sc.nextLine();
        Lowercase = Uppercase.toLowerCase();
        System.out.println("The lowercase equivalent of" + Uppercase + " is " + Lowercase);
    }
}


