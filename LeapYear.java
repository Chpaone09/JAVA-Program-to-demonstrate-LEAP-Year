/*
***********************************************************

Topic   : Program to demonstrate Leap Year in java.
Author  : Chpaone09®
Date    : Oct 20, 2020

************************************************************
*/


import java.util.*;

public class LeapYear{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=0;
    System.out.print("\n\n\t Please enter Year >> ");
    n = sc.nextInt();

    if((n % 4) == 0){
        if((n % 100) ==0){
            if((n % 400) == 0){
            System.out.print("\n\n\t "+n+" is a Leap Year. ");
            }else{
                System.out.print("\n\n\t "+n+" is Not a Leap Year. ");
            }
        }else{
           System.out.print("\n\n\t "+n+" is a Leap Year. ");
        }
    }else{
        System.out.print("\n\n\t "+n+" is Not a Leap Year. ");
    }
    sc.close();
}
}

