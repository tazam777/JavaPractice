




class Tasks {



    public boolean checkStrong(int num)
    {

      //145=1!+4!+5!

      int n=num;
      int total=0;
      


      while(n!=0)
      {
        int smallF=1;



        int digit=n%10;


        for(int i=digit;i>0;i--)
        {
            smallF=smallF*i;
        }

        total=total+smallF;
        if(total==num)
        {
            return true;
        }

        n = n / 10;

      }

        return false;
    }

    public boolean checkASTnum(int m)


    {

       // 153= (1^3)+(5^3)+(2^3)

     
      int count=0;
      int checker=0;
      int n =m;
      int k=n;






            while(n!=0)
            {
                n=n/10;

                count++;

            }

            for(int i=0;i<count;i++)
            {
                int ld=k%10;

                checker=checker+(int)Math.pow(ld,count);

                

                k=k/10;

            }

            if(checker==m)
            {
                return true;
            }

        



        


        return false;

    }
public int printArmStrong()
{


    for(int i=1;i<=1000;i++)
    {
        if(checkASTnum(i)==true)
        {
            System.out.println(i);
        }
    }





    return 0;

}


public int printStrong()
{


    for(int i=1;i<=100000;i++)
    {
        if(checkStrong(i)==true)
        {
            System.out.println(i);
        }
    }





    return 0;

}




}






public class Day9 {

    public static void main(String[] args) {
        Tasks t=new Tasks();
        System.out.println(t.checkASTnum(154));
        t.printArmStrong();

        t.printStrong();
    }
    
}
