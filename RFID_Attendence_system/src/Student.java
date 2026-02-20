public class Student extends Person {

    private String rfidTag;
    private int totalClasses;
    private int attendedClasses;

    public Student(String name, String rollNo, String rfidTag) {
        super(name, rollNo);
        this.rfidTag = rfidTag;
        this.totalClasses = 0;
        this.attendedClasses = 0;
    }

    public String getRfidTag() {
        return rfidTag;
    }

    public void markAttendance() {
        attendedClasses++;
    }

    public void incrementTotalClasses() {
        totalClasses++;
    }

    public double getAttendancePercentage() {
        if (totalClasses == 0) return 0;
        return (attendedClasses * 100.0) / totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public int getTotalClasses() {
        return totalClasses;
    }
}

