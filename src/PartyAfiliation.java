import java.util.Scanner;
public class PartyAfiliation {
    public static void main(String[] args) {
        String Democrat = "D";
        String Republican = "R";
        String Independent = "I";
        String Other = "O";
        String party;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Select your party from D,R,I or O");
        party = userInput.next();

        if (party.equals("D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (party.equals("R")) {
            System.out.println("You get a Republican Elephant!");
        } else if (party.equals("I")) {
            System.out.println("You get a Independent Bison!");
        }
        else {
            System.out.println("You get nothing!");
        }
    }

}