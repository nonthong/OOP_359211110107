package ooplap8;

public class personapp {
    public static void main(String[] args) {
        //create object as studont
        Student student = new Student("1111111111111",
                "Boy saiyai","109 M.2 Thungsong",
                "Male","STD0001","Information System");

        System.out.println(student.toString());
        student.setName("Boy saiyong");
        System.out.println(student.getName());
        System.out.println(student.toString());

    }
}//class
