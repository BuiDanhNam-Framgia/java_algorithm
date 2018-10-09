/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package test;

import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author buidanhnam
 */
public class D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int number = scanner.nextInt();
            int[] arr = new int[number];
            int count = 0;
            while (number-- > 0) {
                arr[count] = scanner.nextInt();
                count++;
            }
            System.out.println(check(arr , arr.length, 0));
        }
    }

    private static String check(int[] arr , int num , int index) {
        if(index > num/2)
            return "YES";
        else if (arr[index] != arr[num-1-index])
            return "NO";
        else {
         return check(arr, num, index +1);
    }
    }

}
