package hw1.Additional;

import java.util.Scanner;

public class sum_and_dominator {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();;
        System.out.println("Enter second number: ");
        int b = input.nextInt();;
        System.out.println("Your sum: " + SUM(a,b));
        System.out.println("Your dominator: " + DOMINATOR(a,b));
    }

    static int SUM(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int DOMINATOR( int a, int b) {
        int min;
        int dominator = 0;
        if (a<0){
            a=a*(-1);
        }
        if (b<0){
            b=b*(-1);
        }
        if (a > b)
            min = b;
        else
            min = a;
        if (min == 0){
            dominator = 1;
        }
        for (int count = 1; count <= min; count++) {
            if (a % count == 0 && b % count == 0) {
                if (count > dominator)
                    dominator = count;
            }
        }
        return dominator;
    }
}