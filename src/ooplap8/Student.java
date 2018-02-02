package ooplap8;

public class Student extends person{
    private String studentid;
    private String major;

    public Student(String personid, String name,
                   String address, String gender,
                   String studentid, String major) {
        super(personid, name, address, gender);
        this.studentid = studentid;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}//class


