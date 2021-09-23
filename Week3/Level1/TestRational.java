import java.util.*;

public class TestRational 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int n, d;

        System.out.print("\n Enter Numerator   : ");
        n = input.nextInt();
        System.out.print(" Enter Denominator : ");
        d = input.nextInt();

        Rational r1 = new Rational();
        Rational r2 = new Rational(n,d);

        System.out.println();

        r1.display();
        r2.display();

        System.out.println();

        System.out.println(" r2.getNum() = " + r2.getNum() + "\n r2.getDenom = " + r2.getDenom());
        
        r1.setNum(89);
        r1.setDenom(34);
        System.out.println("\n New r1 after setting num & denom : ");
        r1.display();

        System.out.println();

        input.close();
    }    
}
