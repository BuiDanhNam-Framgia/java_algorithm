/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package test;

import java.util.Scanner;

/**
 *
 * @author buidanhnam
 */
public class H {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(xxx(n));
        }
    }

    private static long xxx(int n) {
        long count = 0;
        int[] a = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        for (int i = a.length - 1; i >= 0; i--) {
            if (n >= a[i]) {
                 int du = n/a[i];
                n = n % a[i];
                count += du ; 
//                i++;
            }
        }
        return count;
    }
}
