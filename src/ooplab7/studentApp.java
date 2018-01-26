package ooplab7;

import java.util.Scanner;

public class studentApp {
    public static void main(String[] args) {
        //crete object as student
        student sl = new student();
        sl.setId("0001");
        sl.setName("Boy Saiyai");
        sl.setPid("1111111111111");
        sl.setAddress("11/11 T.Thaumyai A.Thungsong");


        System.out.println(sl.toString());
        student s2 = new student("0002",
                "Girl Saiyai",
                "2222222222222",
                "22/22 T.Thawang A.Muang");

        System.out.println(s2.toString());

        student s3 = new student();
        s3 = inputData(s3);
    }//main

    private static student inputData(student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your student info:");
        System.out.println("student ID");
        s.setId(scanner.nextLine());
        System.out.print("Name");
        s.setName(scanner.nextLine());
        System.out.print("Person ID");
        s.setPid(scanner.nextLine());
        System.out.print("Address");
        s.setAddress(scanner.nextLine());
    }
}//class
