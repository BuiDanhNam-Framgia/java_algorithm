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
public class G {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(check(input.charAt(0),input.charAt(2),input.charAt(4),input.charAt(input.length()-1)));
    }

    private static String check(char num1, char operator, char num2, char result) {
        switch(operator){
            case '+':
                return Integer.parseInt(num1+"") +Integer.parseInt(num2+"") 
                        == Integer.parseInt(result+"") ? "YES": "NO" ;   
              case '-':
                return Integer.parseInt(num1+"") - Integer.parseInt(num2+"") 
                        == Integer.parseInt(result+"") ? "YES": "NO" ;   
                  case '*':
                return Integer.parseInt(num1+"") * Integer.parseInt(num2+"") 
                        == Integer.parseInt(result+"") ? "YES": "NO" ;   
                case '/':
                try{
                    return (Integer.parseInt(num1+"") / Integer.parseInt(num2+"") )
                        == Integer.parseInt(result+"") ? "YES": "NO" ;   
                }catch(Exception e){
                    return "NO";
                }
                   
        }
        return "NO";
    }

}
