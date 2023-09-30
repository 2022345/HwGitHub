/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hwgithub;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author suele
 */
public class HwGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
    Scanner sc = new Scanner (System.in);
        
    System.out.println("Please enter your name");
        
    String name = sc.nextLine(); //String ton start the game
       
    Random r = new Random (); // to generate a random number
        
    int number = r.nextInt(10); //number is now a random int less tha 10 
    int [] attempts = new int [3]; // Array to store user's attempt interger
       
    int  numGuess =0; // integer to check the number of guesses
        
    try{  
        /* loop to give to the user 3 attempts, if it's wrong guess, while will repeat */
    while ( numGuess < 3){
    System.out.println(" Guess a number between 0 and 10");
    int guess = sc.nextInt();  // Integer to input the attempts and the number chosen by programming
     
     /* This variable is to check if the user has used the same number */  
    boolean repeat = false; //
    for (int i = 0; i < numGuess; i++){ //loop For to check if the number was input repeatly
    if (attempts [i]== guess){
    repeat= true;
     System.out.println(" That was a waste – you already guessed that number!");
        
        }
        }
    }
   
           
             
     }catch (Exception e){
            }
           
 
    

}
}
    

