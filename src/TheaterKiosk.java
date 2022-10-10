import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      System.out.println("Please enter your age at the kiosk. ");
      int age = in.nextInt();

      if(age >= 21)
      {
          System.out.println("You get a wristband!");
        }

    }

}
