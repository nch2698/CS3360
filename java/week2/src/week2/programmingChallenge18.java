/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author tran le truc
 */
public class programmingChallenge18 {
   public static void main(String[] args) {
        String name, age, city, college, profession, animal, pet;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = keyboard.nextLine();
        
        
        System.out.print("How old are you? ");
        age = keyboard.nextLine();
        
                
        System.out.print("What city are you in? ");
        city = keyboard.nextLine();
        
        
        System.out.print("What coleege are you in? ");
        college = keyboard.nextLine();
        
        
        System.out.print("What is your job? ");
        profession = keyboard.nextLine();
        
        
        System.out.print("What pet do you have? ");
        animal = keyboard.nextLine();
        
        
        System.out.print("What is that pet's name? ");
        pet = keyboard.nextLine();
        
        System.out.println("There once was a person named " + name +" who lived in "+ city +". "
          + "At the age of "+ age+ ",\n" +
        name+ " went to college at "+ college+ "."+ name+ " graduated and went to work as a\n" +
        profession +". Then," + name + "adopted a(n) "+ animal+" named " + pet+ ". They both lived\n" +
        "happily ever after!");
       
    }
}
