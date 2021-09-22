import java.util.Scanner;
import java.util.Arrays;

public class Four 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        String s1 = new String();
        String s2 = new String();
        int option;

        System.out.print("\n Enter Choice: (1)Double Check (2)Anagram Check : ");
        option = input.nextInt();

        if (option==1) 
        {
            System.out.print("\n Enter 1st Num: ");
            num1 = input.nextDouble();
            System.out.print(" Enter 2nd Num: ");
            num2 = input.nextDouble();

            if (equalTo(num1, num2))
                System.out.println("\n\t The 2 values are Equal!\n");
            else
                System.out.println("\n\t The 2 values are NOT Equal\n");
        }
        else if (option==2) 
        {
            input.nextLine();

            System.out.print("\n Enter 1st String: ");
            s1 = input.nextLine();
            System.out.print(" Enter 2nd String: ");
            s2 = input.nextLine();

            if ( equalTo(s1, s2) )
                System.out.println("\n\t YES THEY ARE ANAGRAMS!\n");
            else
                System.out.println("\n\t NO THEY ARENT ANAGRAMS\n");

        }
    }

    public static boolean equalTo (double n1, double n2) 
    {
        if (n1==n2)
            return true;
        return false;
    }

    public static boolean equalTo (String s1, String s2) 
    {
        if (s1.length()==s2.length()) 
        {
            int i, j, len = s1.length();
            int a1[] = new int[len];
            int a2[] = new int[len];
            boolean ans;

            for (i=0; i<len; i++) {
                a1[i] = s1.charAt(i);
                a2[i] = s2.charAt(i);
            }

            Arrays.sort(a1);
            Arrays.sort(a2);

            ans = Arrays.equals(a1, a2);

            return ans;
        }
        else 
            return false;
    }
}
