import java.util.Scanner;

public class OneP2 {
    public static void main(String[] args) 
    {
        Scanner input =  new Scanner(System.in);
        
        int i, j, n;
        String stud  = new String("@student.annauniv.edu");
        String prof  = new String("@prof.annauniv.edu");
        int studNum=0, profNum=0;

        System.out.print("\n Enter Total no. of Email Addresses: ");
        n = input.nextInt();
        input.nextLine();

        String [] s = new String[n];

        System.out.println();
        for (i=0; i<n; i++) 
        {
            System.out.print("Enter Email #"+(i+1)+": ");
            s[i] = input.nextLine();

            int len = s[i].length(); 

            if (len > 18) {
                if ( prof.equals(s[i].substring(len-(prof.length()), len)) )
                    profNum++;
            }
            if (len > 20) {
                if ( stud.equals(s[i].substring(len-(stud.length()), len)) )
                    studNum++;
            }
        }
    
        System.out.println("\n  Number of Student Email Addresses   : " + studNum);
        System.out.println("  Number of Professor Email Addresses : " + profNum);
        System.out.println("  Number of Personal Email Addresses  : "+(n-studNum-profNum));

        System.out.println();
        input.close();
    }
}
