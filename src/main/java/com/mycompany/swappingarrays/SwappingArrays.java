/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swappingarrays;

/**
 *
 * @author Student
 */
public class SwappingArrays {

    public static void main(String[] args) {
        
        int [] number = {10, 20}; 
        int temp; 
 
 
System.out.println("Before the swapping"); 
System.out.println("first = " + number[0] ); 
System.out.println("second = " + number[1] ); 
 
 
//swap of values 
 
temp = number[0]; 
number[0] = number[1]; 
number[1] = temp; 
  

System.out.println("\nAfter the swapping"); System.out.println("first = " + number[0] ); System.out.println("second = " + number[1] ); 

} 
  

}
              
    

