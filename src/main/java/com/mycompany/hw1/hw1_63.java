/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw1;

import java.util.Scanner;

/**
 *
 * @author FUWTF
 */
public class hw1_63 {
    public static void main(String[] args) {
        String concat = "",number = "";
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Sting : ");
        input = scan.nextLine();
       for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                number = number+c;
            }
            else{
                concat = concat+c;
            }
        }
        System.out.println("String = "+concat);
        System.out.println("Number = "+number);
    }
}
