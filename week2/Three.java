import java.util.Scanner;

public class Three {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.print("\n Enter 1st Num: ");
        num1 = input.nextDouble();
        System.out.print(" Enter 2nd Num: ");
        num2 = input.nextDouble();

        if (equalTo(num1, num2))
            System.out.println("\t The 2 values are Equal!\n");
        else
            System.out.println("\t The 2 values are NOT Equal\n");
    }

    public static boolean equalTo (double n1, double n2) {
        if (n1==n2)
            return true;
        return false;
    }
}
