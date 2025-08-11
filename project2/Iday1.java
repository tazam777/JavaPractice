package project2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Iday1 {
    public static String ReveSt(String st)
    {

        char[] a =st.toCharArray();

        int i =0;
        int j=a.length-1;

        while(i<j)
        {
            char temp=a[i];
            a[i]=a[j];
            i++;

        
            a[j]=temp;

            j--;
            

        }

        return new String(a);





    }


    public static boolean PalindromCheck(String q)
    {
        boolean flag=true;

        int i=0;
        int j=q.length()-1;

      

        while(i<j)
        {


        char a=q.charAt(i);
        char b=q.charAt(j);
            if(a!=b)
            {
                return flag =false;
                
            }

            i++;
            j--;
        }
        return flag;
    }



    public static int RevInt(int a)
    {
        int rev=0;
        int copy=a;

        while (copy!=0)
        {
            int lastD=copy%10;
            rev=rev*10+lastD;
            copy=copy/10;
        }



        return rev;
    }


    public static int CountVowels(String s)


    {
        int count =0;
        HashSet<Character> vowset=new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));

        List<Character> vowlist=new ArrayList<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));
        
        HashMap<Long, Character> vowMap = new HashMap<>();
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for (int i = 0; i < vowels.length; i++) {
            vowMap.put((long) i, vowels[i]);
        }





        char[]m=s.toCharArray();

    

            for (char w : m) {
                if(vowset.contains(w))
                {
                    count++;
    
                } 
        }

        return count;



       

    }

    public static void main(String[] args) {
        String g="cat";
        String pp="dad";

        String p=ReveSt(g);

        System.out.println(p);

        System.out.println(PalindromCheck(pp));
        System.out.println(PalindromCheck(g));

    }
}
