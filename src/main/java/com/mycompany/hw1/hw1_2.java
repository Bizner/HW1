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
public class hw1_2 {
    public static void main(String[] args) {
    int a,b,c;
    Scanner scanx = new Scanner(System.in);
    Scanner scany = new Scanner(System.in);
    Scanner scanz = new Scanner(System.in);
     
    System.out.println("Plese Input Number : ");
    a = scanx.nextInt();
    System.out.println("Plese Input Number : ");
    b = scany.nextInt();
    System.out.println("Plese Input Number : ");
    c = scanz.nextInt();
    
    if(a > b && a > c){
        System.out.println("Max : ");
        System.out.println(a);
    }
    else if(b > a && b > c){
        System.out.println("Max : ");
        System.out.println(b);
    }
    else{
        System.out.println("Max : ");
        System.out.println(c);
    }
    
  }
   
}
