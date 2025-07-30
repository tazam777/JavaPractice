

/*💻 Coding Task: "Countdown & Repeat Name"
🧪 Part A: Countdown using a while loop
Ask the user for a number n, then print a countdown from n to 1.

Input:

css
Copy
Edit
Enter a number: 5
Output:

Copy
Edit
5
4
3
2
1
Liftoff!
🧪 Part B: Name repeater using a for loop
Ask for a name and a number. Print the name that many times.

Input:

bash
Copy
Edit
Enter name: Tarique
How many times? 3
Output:

nginx
Copy
Edit
Tarique
Tarique
Tarique
 */

import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the counter from where you want to start the liftoff");

        int i=sc.nextInt();

    


        while(i>0)

        {
            System.out.println(i);
            i--;


        }

        System.out.println("Lift off...!!!!");


        System.out.println("Enter number of time you want to repeat the name");

        int r=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the name");

        String name= sc.nextLine();

        for(int k=0;k<r;k++)
        {

            System.out.println(name); 

        }


    }
    
    
}
