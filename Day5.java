
/*💻 Coding Task: "Average of Student Scores"
🧪 What to Build:
Ask the user how many students are there.

Ask them to enter the scores for each student.

Store the scores in an array.

Calculate and print the average score.

Also print all the scores using a loop. */

import java.util.Scanner;

public class Day5 {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter total number of Students");

        int totalNumber=sc.nextInt();




        int[] scoreStudent=new int[totalNumber];
        int totalScore=0;


        for(int k=0;k<scoreStudent.length;k++)

        {

            System.out.println("Enter the score for Student number " + (k+1));

            scoreStudent[k]=sc.nextInt();

            totalScore=scoreStudent[k]+totalScore;


        }


        for(int n :scoreStudent)

        {
            System.out.println("Scores are " + n);
        }

        System.out.println("Average Score is " + (double)(totalScore/totalNumber));

        sc.close();


    }
    
}
