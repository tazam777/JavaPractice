

/*💻 Coding Task: "Sort Student Scores"
🧪 What to Build:
Ask the user how many scores they want to enter.

Store them in an int[] array.

Sort the array using Bubble Sort logic.

Print the sorted scores (ascending order). */



import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter total numbers to store");

        int countNum=sc.nextInt();
        sc.nextLine();

        int[] numArray=new int[countNum];


        for(int n=0;n<numArray.length;n++)


        {


            System.out.println("Enter the number");
            numArray[n]=sc.nextInt();
        }


         


        System.out.println("Unsorted Araay is");

        for(int y:numArray)
        {
            System.out.println(y);
        }




    


        for(int j=0;j<numArray.length-1;j++)
        {

            for(int l=0;l<numArray.length-1-j;l++)
        
        {
            if(numArray[l]>numArray[l+1])
            {

                int temp=numArray[l];
                numArray[l]=numArray[l+1];
                numArray[l+1]=temp;


            }
    



        }


    
    }



    System.out.println("Sorted Array is");

        for(int y:numArray)
        {
            System.out.println(y);
        }

        sc.close();












    }
    
}
