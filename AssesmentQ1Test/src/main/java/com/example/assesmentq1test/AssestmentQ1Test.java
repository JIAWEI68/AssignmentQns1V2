
package com.example.assesmentq1test;

import java.util.Scanner;

public class AssestmentQ1Test {

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("First number : ");
        int input1 = keyboard.nextInt();
        System.out.println("Second number : ");
        int input2 = keyboard.nextInt();
        System.out.println("Third number : ");
        int input3 = keyboard.nextInt();
        
        if ((input1<=input2)&&(input1<=input3)){
            System.out.println(input1 + " is the smallest integer.");

        }
        else if ((input2<=input1)&&(input2<=input3)){
            System.out.println(input2 + " is the smallest integer.");
        }
        else {
            System.out.println(input3 + " is the smallest number");
        }
    }

}
