/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.queueexercise;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Cha
 */
public class QueueExercise {

    public static void main(String[] args) {
       /*Exercise 1: Using Java, simulate a line 
        at a store or bank using a queue. The program should allow the customer 
        to join the line and wait for service, and should serve customers in the 
        order they joined the line.*/       
      
       Queue<String> line = new LinkedList<>();
       Scanner scanner = new Scanner(System.in);
       
       boolean done = false;
       while(!done){
           System.out.println("Enter command [join,serve,exit]: ");
           String command = scanner.nextLine();
           
           switch(command){
               case "join":
                   System.out.println("Enter name: ");
                   String name = scanner.nextLine();
                   line.add(name);
                   System.out.println(name+" has joined");
                   break;
                
               case "serve":
                   if(line.isEmpty()){
                       System.out.println("There's no one in the line.");                       
                       break;
                   }
                   else{
                       String front = line.remove(); 
                       System.out.println(front+" has been served.");
                       break;
                   }
                
               case "exit":
                   System.out.println("Exiting the program.");
                   done =true;
                   break;
                
               default:
                   System.out.println("Command is invalid, try again.");
                
                scanner.close();
           }
       }
       
      
       
       
       
    }
}
