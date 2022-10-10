import java.util.Scanner;
public class birthMonth {
    public static void main(String[] args) {
        final int minMonth = 1;
        final int maxMonth = 12;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your birth month ");
        int birthMonth = in.nextInt();
        if((birthMonth >= minMonth) && (birthMonth <= maxMonth))
        {
            System.out.println(" Your birth month is: " + birthMonth);
        }
        else{
            System.out.println("You entered an incorrect month value: " +birthMonth);
        }
    }
}







