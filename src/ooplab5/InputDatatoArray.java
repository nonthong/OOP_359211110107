
package ooplab5;

import java.util.Scanner;

public class InputDatatoArray {
    private static int MAX = 5;
    public static void main(String[] args) {
        int number[] = new int[MAX];
        System.out.println(number.length);
        //for
        number = inputData(number);

    }//main
    private static int[] inputData(int[]number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        for (int i = 0; i < number.length; i++) {
            System.out.println("number["+i+"]: ");
            number[i] = scanner.nextInt();
        }
        return number;
    }
}//class
