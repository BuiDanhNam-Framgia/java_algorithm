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
public class C {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int first = s.nextInt();
            int end = s.nextInt();
            int count = 0;
            for (int i = first; i <= end; i++) {
                if (meoNT(i) && isNT(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean isNT(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt((float) a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean meoNT(int strA) {
        char[] cs = (strA + "").toCharArray();
        int sum = 0;
        for (char c : cs) {
            int intC = Integer.parseInt(c + "");
            if (!isNT(intC)) {
                return false;
            }
            sum += intC;
        }
        return isNT(sum);
    }
}
