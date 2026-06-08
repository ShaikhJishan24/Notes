package Array;
import java.util.Scanner;


public class AdvanceBillingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Maxsize = 50;

        String product[] = new String[Maxsize];
        int Price[] = new int[Maxsize];

        int count = 0;

        for (int i = 0; i < Maxsize; i++) {
            System.out.println("Enter Product " + (count + 1) + ": ");
            product[i] = input.next();
            count++;

            char ch;
            do {
                System.out.print("Do you Want to Add More (Y/N): ");
                ch = input.next().charAt(0);

                if (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n') {
                    System.out.println("Enter a valid option (Y/N): ");
                }
            } while (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n');

            if (ch == 'N' || ch == 'n') {
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter " + product[i] + " Price: ");
            Price[i] = input.nextInt();
            sum += Price[i];
        }

        double GST = (sum * 18.0) / 100;
        int Final_Total = (int) (sum + GST);

        char gstChoice;
        do {
            System.out.print("Do you Want to add GST (Y/N): ");
            gstChoice = input.next().charAt(0);

            if (gstChoice != 'Y' && gstChoice != 'y' && gstChoice != 'N' && gstChoice != 'n') {
                System.out.println("Enter a valid option (Y/N): ");
            }
        } while (gstChoice != 'Y' && gstChoice != 'y' && gstChoice != 'N' && gstChoice != 'n');

        System.out.println("---------Output---------");

        for (int i = 0; i < count; i++) {
            System.out.println(product[i] + " = " + Price[i] + "/");
        }

        System.out.println("----------------");

        System.out.println("Total = " + sum);

        if (gstChoice == 'Y' || gstChoice == 'y') {
            System.out.println("GST = 18%");
            System.out.println("----------------");
            System.out.println("Final Total = " + Final_Total);
        }

        input.close();
    }
}