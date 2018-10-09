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
public class B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt();
            System.out.println(check(a));
        }
    }

    private static String check(int a) {
        String strA = String.valueOf(a);
        return strA.charAt(0) == strA.charAt(strA.length() - 1) ? "YES" : "NO";
    }
}
