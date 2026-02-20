import java.time.LocalDateTime;

public class AttendanceRecord {

    private String rollNo;
    private LocalDateTime timestamp;

    public AttendanceRecord(String rollNo) {
        this.rollNo = rollNo;
        this.timestamp = LocalDateTime.now();
    }

    public String getRollNo() {
        return rollNo;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
