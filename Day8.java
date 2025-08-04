
/*
 Print all even numbers from 1–100

Reverse a number (e.g. 1234 → 4321)

Check if a number is prime

Find factorial using loop

Count digits of a number
 */



 class Task
 {



    public int CountD(int num)
    {
        int count=0;
        int oriN=num;

        while(num!=0)
        {
            num=num/10;
            count++;
        }

        System.out.println("Number of digits in number " + oriN + " is " + count);




        return count;
    }
    

    public int factN(int num)
    {
        int oriN=num;
        int fnum=1;
       for(int i=num;i>0;i--)
       {
        fnum=fnum*i;
       }

       System.out.println("Factorial of " + oriN + " is " + fnum);



        return fnum;
    }

    public boolean primeC(int num)

    {


        while(num>1)
        {

        for(int i=2;i*i<=num;i++)

        {
            if(num%i==0)
            {



               return false ;
            }

            
            


        }

        return true;
    }
    return false;
    }


    public int revN(int num)
    {

        int revnumber=0;

        int oriN=num;


        while(num!=0)
        {

            int lastD=num%10;

            revnumber=revnumber*10+lastD;   

            num=num/10;

        }

        System.out.println("Reversed number of " + oriN + " is " + revnumber);
        return revnumber;
 
    }

    

     

     public int dispE()
     {
    
        int count=0;

     for(int i=1;i<101;i++)
     {
         if(i%2==0)
         {
             count++;
             System.out.println(i);

         }

     }

     System.out.println("All number of even numbers between 1 to 100 is " + count );

     return count;
    }

 }



public class Day8 {

   



    public static void main(String[] args) {
        
        Task p=new Task();

        p.dispE();
        p.revN(1234);
        p.factN(31);
        p.CountD(8);
        System.out.println(p.primeC(12) + " " + p.primeC(11) + " " + p.primeC(0) + " " + p.primeC(1) + " " + p.primeC(-1));

       

        

    }
    
}





/*✅ Day 1 Java Cheat Sheet: Core Logic Patterns
1. 🟢 Print All Even Numbers (1 to 100)
java
Copy
Edit
for (int i = 1; i <= 100; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}
Logic: A number is even if num % 2 == 0

2. 🔁 Reverse a Number
java
Copy
Edit
int rev = 0;
while (num != 0) {
    int digit = num % 10;
    rev = rev * 10 + digit;
    num /= 10;
}
Logic: Strip digits one-by-one from the end and build the number in reverse.

3. 🔍 Prime Check
java
Copy
Edit
boolean isPrime = true;
if (num <= 1) isPrime = false;
for (int i = 2; i * i <= num; i++) {
    if (num % i == 0) {
        isPrime = false;
        break;
    }
}
Logic: A prime number has no divisors other than 1 and itself.
Optimize by checking till i * i <= num.

4. ✖️ Factorial Using Loop
java
Copy
Edit
int fact = 1;
for (int i = num; i >= 1; i--) {
    fact *= i;
}
Logic: Multiply from num down to 1.

5. 🔢 Count Digits of a Number
java
Copy
Edit
int count = 0;
if (num == 0) count = 1;
while (num != 0) {
    num /= 10;
    count++;
}
Logic: Keep dividing the number by 10 until it's 0. Each step removes one digit.

🔥 Pro-Level Tip:
num % 10 → last digit

num / 10 → chop last digit

Always clone int original = num; if you're modifying it but still need the original value for print or compare.

 */
