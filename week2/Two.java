import java.util.Scanner;

public class Two 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Integer: ");
        int n = input.nextInt();
    
        palindromicPrime(n);
    }

    public static void palindromicPrime( int n) 
    {
        Scanner input = new Scanner(System.in);
        int i, j, k=0;
        boolean prime, palindrome;
        int [] arr = new int[1000];

        arr[k] = 2;
        int count=1;

        for (i=3; i<n; i++) 
        {
            prime = true;
            for (j=2; j<i; j++) 
            {
                if (i%j == 0) {
                    prime=false;
                    break;
                }
            }

            if (prime) 
            {
                if (revv(i)) {
                    arr[++k] = i;
                    count++;
                }
            }
        }

        System.out.println("\n PALINDROME INTEGERS: \n");
        for (j=0; j<count; j++)
            System.out.println(" " + arr[j]);
    
    }   

    public static boolean revv (int num) 
    {
        int result=0, reminder;
        int original=num;

        while (num != 0) {
            reminder = num%10;
            result = result*10 + reminder;
            num = num/10;
        }


        if (result == original)
            return true;
        
        return false;
    }
}
