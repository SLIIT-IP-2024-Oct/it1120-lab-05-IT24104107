import java.util.Scanner;

public class IT24104107Lab5Q3 {
    public static final int ROOM_CHARGE = 48000;

    public static void main(String[] args) {
        Scanner lab = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = lab.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = lab.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate + 1;
        double discountRate = 0;

        if (daysReserved >= 3) {
            if (daysReserved <= 4) {
                discountRate = 0.1;
            } else {
                discountRate = 0.2;
            }
        }

        double totalAmount = ROOM_CHARGE * daysReserved * (1 - discountRate);

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

      
    }
}