
/* Key Coding Question (Day 2)
"Can you take input from the user in Java, store it in variables, and display a formatted output?"

Scanner is an librabry in java to take in input we basically use it by invoking its class we also close it as it may lead to memory leakage
we use methods like next() or nextInt() first to tell java to grab the data and if there is mis match it throws error also if we dont use it we wont be able to use scaane tos tore it and also then we would have to use parse int and buffer to do the same 
Scanner sc = new Scaaner(System.in) means to tell java use the scanner class and create new object and take daya from keyboard which is shown by System.in
*/

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age");

        int age = sc.nextInt();


        System.out.println("Enter Name");
     sc.nextLine();

        String name = sc.nextLine();

        sc.close();

        System.out.println("Hi my name is " + name + "\n" + "I am " + age + " years old. ");


        
    }
    
}
