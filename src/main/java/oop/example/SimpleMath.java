package oop.example;
import java.util.Scanner;
public class SimpleMath {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is the first number?");
        int firstnum = scnr.nextInt();
        System.out.print("What is the second number?");
        int secondnum = scnr.nextInt();
        System.out.println( firstnum + " + "+ secondnum + " = " + (firstnum+secondnum) + "\n" + firstnum + " - "+ secondnum + " = " + (firstnum-secondnum) + "\n" + firstnum + " * "+ secondnum + " = " + (firstnum*secondnum) + "\n" + firstnum + " / "+ secondnum + " = " + (firstnum/secondnum));
 1   }
}
