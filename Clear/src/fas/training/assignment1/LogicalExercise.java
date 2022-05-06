package fas.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {
    public static void main(String[] args){
        int a = 0,b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu 1:");
        a = sc.nextInt();
        System.out.println("Nhap vao so thu 2:");
        b = sc.nextInt();
        if(a > b){
            System.out.println(a+">"+b);
        }else if(a < b){
            System.out.println(a+"!="+b);
            System.out.println(a+"<"+b);
            System.out.println(a+"<="+b);
        }else{
            System.out.println(a+"="+b);
        }
    }
}
