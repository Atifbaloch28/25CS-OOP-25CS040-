import java.util.ArrayList;

public class AttendanceService {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<AttendanceRecord> records = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void startNewClass() {
        for (Student s : students) {
            s.incrementTotalClasses();
        }
        System.out.println("New class session started.\n");
    }

    public void scanRFID(String rfidTag) {

        for (Student s : students) {
            if (s.getRfidTag().equals(rfidTag)) {

                // Prevent duplicate attendance in same session
                for (AttendanceRecord record : records) {
                    if (record.getRollNo().equals(s.getId())) {
                        System.out.println("Attendance already marked for today.\n");
                        return;
                    }
                }

                s.markAttendance();
                records.add(new AttendanceRecord(s.getId()));
                System.out.println("Attendance marked for " + s.getName() + "\n");
                return;
            }
        }

        System.out.println("Invalid RFID Tag!\n");
    }

    public void showReport() {
        System.out.println("---- Attendance Report ----");
        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            System.out.println("Roll No: " + s.getId());
            System.out.println("Attendance: " + s.getAttendedClasses() + "/" + s.getTotalClasses());
            System.out.printf("Percentage: %.2f%%\n", s.getAttendancePercentage());
            System.out.println("--------------------------");
        }
    }
}

