/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package New;

import java.util.Scanner;

/**
 *
 * @author buidanhnam
 */
public class J {
    private static int[][] A ;
    private static int[][] CV ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
         System.out.println("Test " + t + ":");
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m =  scanner.nextInt();
            A = new int[n][m];
            CV = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = scanner.nextInt();
                    A[i][j] = x;
                    CV[j][i] = x;
                }
            }
            printMatric(n,m);
        }
    }

    private static void printMatric(int n, int m) {
        int[][] result = new int[n][m];
        int x = 0 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * CV[k][j];
                }
                 System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
