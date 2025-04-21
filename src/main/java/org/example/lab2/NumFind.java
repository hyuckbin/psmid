package org.example.lab2;

import java.util.Scanner;

public class NumFind {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] nums = new int[count];
        for(int i=0 ; i<nums.length ; i ++){
            nums[i] = s.nextInt();

        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int numb : nums){
            if(first < numb) first = numb;
        }

        int index =0;
        for(int numb : nums) {
            if(second<numb && numb < first) second = numb;
        }

        System.out.println("MAX : " + first + " second " +second);
        }
    }

