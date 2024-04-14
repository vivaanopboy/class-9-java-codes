//Write a program to take three numbers from user and print the largest among them
import java.util.*;
class LargestAmoung3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a>b) && (a>c))
            System.out.println(a+" is the largest");
        else if ((c>b) && (c>a))
            System.out.println(c+" is the largest");
        else
            System.out.println(b+" is the largest");
    }
}