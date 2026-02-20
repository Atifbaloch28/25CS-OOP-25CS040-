import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AttendanceService service = new AttendanceService();

        // Adding sample students
        service.addStudent(new Student("Ali", "21CS01", "RFID1001"));
        service.addStudent(new Student("Ahmed", "21CS02", "RFID1002"));
        service.addStudent(new Student("Sara", "21CS03", "RFID1003"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== RFID Attendance System =====");
            System.out.println("1. Start New Class");
            System.out.println("2. Scan RFID");
            System.out.println("3. View Report");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    service.startNewClass();
                    break;

                case 2:
                    System.out.print("Enter RFID Tag: ");
                    String tag = scanner.nextLine();
                    service.scanRFID(tag);
                    break;

                case 3:
                    service.showReport();
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.\n");
            }
        }
    }
}


