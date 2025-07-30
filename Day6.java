

/*💻 Coding Task: "Name Search and Filter"
🧪 What to Build:
Ask the user how many names they want to enter.

Store those names in a String array.

Ask the user for a name to search.

Print whether it was found (case-insensitive).

Bonus: Print all names that start with a vowel. */

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter total number of Names to store");

        int totalNumber=sc.nextInt();

        String[] nameStore=  new String[totalNumber];

        System.out.println("Enter the names to store");
        sc.nextLine();

        for(int n=0;n<nameStore.length;n++)

        /*
         in ln is 3

        0 True 1
        1 True 2
        2 True 3
        3 False break
         */

        {

            nameStore[n]=sc.nextLine();

        }

       


        System.out.println("Enter the name to search");
        String toSearch=sc.nextLine();
        boolean flag=false;

        for(String n:nameStore)
        {
            if(n.equalsIgnoreCase(toSearch)){
                flag=true;      
                
                
            }

            else{
                  
            }
        

        }



if (flag) {
    System.out.println("MATCH FOUND");
} else {
    System.out.println("MATCH NOT FOUND");
}








    }
    
}
