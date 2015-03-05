package com.mycompany.hw1;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FUWTF
 */
public class hw1_1 {
    public static void main(String[] args) {
        System.out.println("Input Number : ");
        Scanner scan = new Scanner(System.in);
        float number = scan.nextFloat();
        
        if(number - (int)number == 0){
            System.out.println((int)number);
        }
        else{
            System.out.println(number);
        }
        
    }
    
}
