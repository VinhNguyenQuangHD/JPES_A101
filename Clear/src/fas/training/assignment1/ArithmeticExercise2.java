package fas.training.assignment1;

import java.util.Scanner;

public class ArithmeticExercise2 {
    public static void main(String[] args){
        int a = 0,b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu 1:");
        a = sc.nextInt();
        System.out.println("Nhap vao so thu 2:");
        b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
