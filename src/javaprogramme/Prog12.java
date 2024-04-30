package javaprogramme;

import java.util.Scanner;

public class Prog12 {

    // Driver method
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;     //Declare a character
        System.out.println("Enter the character ");
        ch=sc.next().charAt(0);   //Initialize the character

        //check whether alphabet or not using if-else statement

        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            System.out.print(ch+" is an Alphabet ");
        }
        else
        {
            System.out.print(ch+" is not an Alphabet ");
        }
    }

}
