//import org.graalvm.compiler.lir.ssa.SSAUtil.PhiValueVisitor;

public class Rational 
{
    int num;
    int denom;

    //DEFAULT CONSTRUCTOR
    public Rational () {
        denom = 1;
    }
    //PARAMETERIZED CONSTRUCTOR
    public Rational (int n, int d) {
        num = n;
        denom = d;
    }

    //GET METHODS: only return type
    public int getNum () {
        return num;
    }
    public int getDenom () {
        return denom;
    }

    //SET METHODS: only parameter, NO return
    public void setNum (int n) {
        num = n;
    }
    public void setDenom (int d) {
        denom = d;
    }

    //DISPLAY
    public void display () {
        System.out.println(" Numerator = " + num + " Denominator = " + denom);
    }

    //INCREMENTER
    public void increment (int val) {
        num += val;
        denom += val;
    }
}