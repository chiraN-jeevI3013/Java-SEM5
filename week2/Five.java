import java.util.Scanner;

import java.util.Arrays;

public class Five 
{
    static final String[] flavours = {
        "Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip",
        "Mocha Almond Fudge", "Mango", "Praline Cream", "Lichi"
    };

    public static void main(String[] args) 
    {
        int i, j, n = flavours.length;
        String result [] = new String[n];
        result = flavourSet(flavours);
        
        System.out.println("\n USER PREFERENCE: \n");
        for (i=0; i<n; i++) 
        {
            System.out.println(result[i]);
        }
        System.out.println("\n");
    }

    public static String [] flavourSet (String flavor []) 
    {
        Scanner input = new Scanner(System.in);
        int i, j, n = flavours.length;
        int loves[] = new int[n];

        String pref [] = new String[n];

        System.out.println("\n");
        for (i=0; i<n; i++) {
            System.out.print(" " + flavours[i] + " ");
        }
        System.out.println("\n\n"+"Enter Your Preferences (0-Most Favorite, 7-Least Favorite): \n");
        for (i=0; i<n; i++) 
        {
            System.out.print(" " + flavours[i] + " Preference: ");
            loves[i] = input.nextInt();
        }

        for (j=0; j<n; j++) 
            pref[loves[j]] = flavours[j];
        
        input.close();
        
        return pref;
    }
}
