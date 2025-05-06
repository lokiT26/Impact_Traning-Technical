// Jon Snow and the men in the north decided to open Castle Black for the northerners and the Castle was turned into a Hotel. The Hotel was flourishing and there was high demand for the rooms. So Jon Snow decided to modify the tariff accordingly. Write a program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June and November-December].

// Input Format
// The first input integer denotes the count of the month. The second input integer denotes the room rent per day. The third input integer denotes the number of days stayed in the hotel.

public class hotel_tariff {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the room rent per day: ");
        int roomRent = scanner.nextInt();
        System.out.print("Enter the number of days stayed: ");
        int days = scanner.nextInt();

        double totalRent = roomRent * days;
        
        if (month > 12){
            System.out.print("Invalid Input");
            System.exit(0);
        }
        
        // Check if the month is in peak season (April-June and November-December)
        if ((month >= 4 && month <= 6) || (month == 11 || month == 12)) {
            totalRent *= 1.2; // Increase by 20%
        }

        System.out.println((int)totalRent);
        scanner.close();
    }
}
