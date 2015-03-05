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
public class hw1_62 {
    public static void main(String[] args) {
        String word;
        Scanner scan = new Scanner(System.in);
        System.out.println("Plese Input Word : ");
        word = scan.nextLine();
         for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
           if(c != '-'){
               System.out.print(c);
           }
           else{
               System.out.print("\n");
           }
      
        }
        
    }
    
}
