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
public class hw1_3 {
    public static void main(String[] args) {
        int grade,result;
        float tmp;
        System.out.println("Plese Input Point (0 - 100) : ");
        Scanner scan = new Scanner(System.in);
        grade = scan.nextInt();
        tmp = (float)grade;
        result = (int) tmp;
    switch(result){
        case 40:
            System.out.println("F");
            break;
        case 50:
            System.out.println("D");
            break;
        case 60:
            System.out.println("C");
            break;
        case 70:
            System.out.println("B");
            break;
        case 80:
            System.out.println("A");
            break;
        default:
            System.out.println("A");
    }
        
  }
    
}
