import java.util.Scanner;

public class One {
    public static void main(String[] args) 
    {
        Scanner input =  new Scanner(System.in);
        
        int i, j, n;
        
        String stud  = new String("@student.annauniv.edu");
        String prof  = new String("@prof.annauniv.edu");
        int studNum=0, profNum=0;

        System.out.print(" Enter Total no. of Email Addresses: ");
        n = input.nextInt();
        input.nextLine();

        String [] s = new String[n];

        System.out.println();
        for (i=0; i<n; i++) 
        {
            System.out.print("Enter Email #"+i+": ");
            s[i] = input.nextLine();

            int len = s[i].length(); 

            if ( stud.equals(s[i].substring(len-(stud.length()), len)) )
                    studNum++;
            else if ( prof.equals(s[i].substring(len-(prof.length()), len)) )
                    profNum++;
            /*
            if (len > 18) {
                if ( stud.equals(s[i].substring(len-20, len)) )
                    studNum++;
                else if ( prof.equals(s[i].substring(len-18, len)) )
                    profNum++;
            }
            */
            /*
            if (s[i].length() > 20) {
                if ( stud.equals(s[i].substring(len-20, len)) )
                    studNum++;
            }
            */    
        }
    
        System.out.println("Number of Student Email Addresses   : " + studNum);
        System.out.println("Number of Professor Email Addresses : " + profNum);
        //System.out.println("Number of Personal Email Addresses  : "+(n-studNum-profNum));

        input.close();
    }
}