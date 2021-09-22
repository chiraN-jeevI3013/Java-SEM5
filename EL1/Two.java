import java.util.Scanner;

import org.graalvm.compiler.nodes.extended.PluginFactory_FixedValueAnchorNode;

public class Two {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String entry;
        int i, j;
        boolean itsaNum = true, itsaBlank = true;

        System.out.print("Enter Aadhaar Number: ");
        entry = input.nextLine();

        if (entry.length() == 14) {
            for (i=0; i<14; i++) 
            {
                //System.out.println(" i = "+i+" entry.charAt(i) = "+entry.charAt(i));

                if (i==4 || i==9) {
                    if ( entry.charAt(i)!=' ' )
                        itsaBlank = false;
                }
                else 
                    if ( !digit(entry.charAt(i)) )
                        itsaNum = false;
            }
        
            if (itsaNum && itsaBlank)
                System.out.println("\n  VALID");
            else
                System.out.println("\n  INVALID");
        } 
        else
            System.out.println("\n  INVALID");
        
    }
    
    public static boolean digit (char c) {
        if (c>='0' && c<='9')
            return true;
        return false;
    }

}
