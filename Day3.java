
/*📌 Key Coding Question (Day 3):
"Can your Java program make decisions using if-else based on user input?"

🧠 Key Concepts to Study: Java if, else, else if
✅ 1. What is if-else?
Java needs a way to make choices, like:

“If age is above 18 → print ‘Adult’, otherwise → print ‘Minor’.”

This is done with: */



import java.util.Scanner;


public class Day3 {
    public static void main(String[] args) {
        


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Age");
       

        int age=sc.nextInt();


        if(age>18)
        {
            System.out.println("Adult");

        }

        else{
            System.out.println("Minor");

        }

        sc.close();

    }
    
}
