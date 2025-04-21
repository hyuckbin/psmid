package org.example.lab1;

import java.util.Scanner;

public class NumMax {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();


        int[] nums = {num1,num2,num3};

        int maxnum = nums[0];
        int minnum = nums[0];

        for(int number : nums){

            if(maxnum < number){
                maxnum = number;
            }
            if(minnum > number){
                minnum = number;
            }
        }
        System.out.println("max: " +maxnum + " min : " +minnum );



    }
}
