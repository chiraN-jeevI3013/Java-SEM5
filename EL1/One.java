import java.util.Scanner;

public class One {
    
    public static String prefix (String s1, String s2) {
        int i, j;
        String res = ""; 
        String bigsString, smallsString, temp;
        boolean prefixAvailable;

        if (s1.length() > s2.length()) {
            bigsString = s1;
            smallsString = s2;
        }
        else {
            bigsString = s2;
            smallsString = s1;
        }

        prefixAvailable = false;
        for (i=0; i<smallsString.length(); i++) {
            temp = smallsString.substring(0, i+1);

            if (bigsString.contains(temp)) {
                prefixAvailable = true;
                res = temp;
            }
        }
        if (prefixAvailable)    
            return res;
        else 
            return "";
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        String result = new String();

        System.out.print("Enter 1st string: ");
        s1 = input.nextLine();
        System.out.print("Enter 2nd string: ");
        s2 = input.nextLine();

        result = prefix(s1, s2);

        System.out.println("\n Longest Common Prefix = "+result);

        input.close();
    }

}