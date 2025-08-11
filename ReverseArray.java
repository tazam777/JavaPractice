public class ReverseArray {

    public static void reverseArray(int[] arr) {
       int left =0;
       int right=arr.length-1;
       int temp=0;

       
    
        while (left<right)
        {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }


       }



       public static boolean plaindromeCheck(String s)
       {

        char[] arr=s.toCharArray();
    

        int left=0;
        int right=s.length()-1;



        while(left<right)
        {

            if(arr[left]!=arr[right])
            {
                return false;
                
            }



            left++;
            right--;
        }


            return true;
    }



    public static void twoSum(int[]arr,int sum)
    {


        int left=0;
        int right=arr.length-1;
        int[] num=new int[2];

        boolean flag=false;

        

    

        while(left<right)
        {

            int total=arr[left]+arr[right];

            if(total==sum)
            {
                num[0]=arr[left];
                num[1]=arr[right];
                flag=true;
            
                break;
        
            }

         else if (total>sum)
            {
                right--;

            }

          else 
          {
            left++;
          }


        


        }


        if(flag==true)
        {
            System.out.println("2 sum pair is " + num[0]+ " "+num[1]);

        }

        else
        {
            System.out.println("2 sum pair doest exist");
        }



    

    }





       public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr);

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }


       System.out.println( plaindromeCheck("ma2m"));

       int[] arr1 = {2, 7, 11, 15};
        int target = 9;
        twoSum(arr1, target);


       



    }

   

    }

