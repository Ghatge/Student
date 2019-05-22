/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 AKshay Ghatge
 */
package arraydemo;
import java.util.Scanner;
/**
 *
 * @author AKSHAY
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the string");
        String word=input.next();
        //Defining the array
        char[] name=new char[word.length()];
     
        System.out.println(name.length);
        for(int i=0;i<word.length();i++)
        {
            name[i]=word.charAt(i);
        }
        //print the word to the user
        for(int i=name.length-1;i>=0;i++)
        {
            System.out.print(name[i]);
            h
        }
    }
    
}
